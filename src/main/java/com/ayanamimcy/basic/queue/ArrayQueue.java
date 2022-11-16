package com.ayanamimcy.basic.queue;

import com.ayanamimcy.basic.arrays.Array;

/**
 * 基于数据来实现队列
 * 
 * @author chenyangm
 *
 * @param <E>
 */
public class ArrayQueue<E> implements Queue<E> {

	private Array<E> queue;

	public ArrayQueue() {
		this.queue = new Array<>();
	}

	public ArrayQueue(int capcity) {
		super();
		this.queue = new Array<>(capcity);
	}

	@Override
	public void enqueue(E e) {
		// TODO Auto-generated method stub
		this.queue.addLast(e);
	}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		return this.queue.deleteFirst();
	}

	@Override
	public E getFront() {
		// TODO Auto-generated method stub
		return this.queue.get(0);
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return this.queue.getSize();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.queue.isEmpty();
	}

	public int getCapcity() {
		return this.queue.getCapcity();
	}

	@Override
	public String toString() {
		return "ArrayQueue [queue=" + queue + "]";
	}

	public static void main(String[] args) {
		ArrayQueue<Object> arrayQueue = new ArrayQueue<>();

		for (int i = 0; i < 10; i++) {
			arrayQueue.enqueue(i);
			System.out.println(arrayQueue);

			if (i % 3 == 2) {
				arrayQueue.dequeue();
				System.out.println(arrayQueue);
			}
		}

		for (int i = 0; i < 10000000; i++) {
			arrayQueue.enqueue(i);
		}

		arrayQueue.dequeue();
		System.out.println("finished");
	}

}
