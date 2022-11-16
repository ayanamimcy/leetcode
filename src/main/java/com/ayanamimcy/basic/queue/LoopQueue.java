package com.ayanamimcy.basic.queue;

import java.util.Arrays;

/**
 * 循环队列
 * 
 * 主要是解决数组队列在出队列时，时间复杂度达到O(n)级别的程度，如果数据量非常大的情况下，会十分的影响效率
 * 
 * -> 因为需要在出队列的时候，将所有的元素都向前移动一位
 * 
 * 主要解决方法：
 * 
 * 1. 维护两个指针变量，用于标示队列的开头和结尾
 * 
 * 2. 队列会被循环使用，需要注意扩缩容和指针变量维护的问题。 主要是如何判断队列的开头和结尾， 以及如何判断队列的空和满
 * 
 * Q：
 * 
 * 如果通过不维护容量变量，只通过两个位置指针计算出队列的大小
 * 
 * @author chenyangm
 *
 * @param <E>
 */
public class LoopQueue<E> implements Queue<E> {

	private E[] queue;
	private int frout, tail;
	private int size;

	public LoopQueue() {
		this(10);
	}

	/**
	 * 关于这边为什么要初始化 capcity + 1 的容量？
	 * 
	 * 对于一个容量固定的循环队列来说，一般情况下 front == tail 可以用来表示队列为空，
	 * 
	 * 但是如果说整个队列的容量都用完的情况下，front == tail 也是成立的。所以一个条件表示了两种情况非常不利于我们进行边界条件的判定。
	 * 
	 * 所以可以浪费一个容量， 将 tail + 1 == front 作为队列全满的条件，而进行区分。属于人为刻意的逻辑
	 * 
	 * @param capcity
	 */
	public LoopQueue(int capcity) {
		this.queue = (E[]) new Object[capcity + 1];
		this.frout = 0;
		this.tail = 0;
		this.size = 0;
	}

	@Override
	public void enqueue(E e) {
		addLast(e);
	}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		return deleteFirst();
	}

	@Override
	public E getFront() {
		// TODO Auto-generated method stub
		return this.queue[frout];
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return frout == tail;
	}

	public int getCapcity() {
		return this.queue.length - 1;
	}

	private void addLast(E e) {
		if (isFull()) {
			resize(getCapcity() * 2);
		}

		this.queue[tail] = e;
		increaseTail();
		size++;
	}

	private E deleteFirst() {
		E result = this.queue[frout];
		increaseFront();
		size--;
		return result;
	}

	private boolean isFull() {
		return caculateAddr(tail + 1) == frout;
	}

	private int caculateAddr(int num) {
		return (num % queue.length);
	}

	private void increaseTail() {
		this.tail = caculateAddr(++this.tail);
	}

	private void increaseFront() {
		this.frout = caculateAddr(++this.frout);
	}

	/**
	 * 进行扩容
	 * 
	 * @param capcity
	 */
	private void resize(int capcity) {
		E[] newQueue = (E[]) new Object[capcity + 1];

		for (int i = 0; i < getSize(); i++) {
			newQueue[i] = this.queue[caculateAddr(i + frout)];
		}
		this.queue = newQueue;
		this.frout = 0;
		this.tail = getSize();
	}
	
	@Override
	public String toString() {
		return "LoopQueue [queue=" + Arrays.toString(queue) + ", frout=" + frout + ", tail=" + tail + ", size=" + size
				+ ", isFull = " + isFull()
				+ "]";
	}

	public static void main(String[] args) {
		LoopQueue<Integer> queue = new LoopQueue<Integer>();

		for (int i = 0; i < 10; i++) {
			queue.enqueue(i);
		}
		System.out.println(queue);

		queue.dequeue();
		queue.dequeue();
		System.out.println(queue);

		queue.enqueue(11);
		System.out.println(queue);
		queue.enqueue(12);
		System.out.println(queue);
		queue.enqueue(13);
		System.out.println(queue);

	}

}
