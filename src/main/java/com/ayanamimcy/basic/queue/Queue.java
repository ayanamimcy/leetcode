package com.ayanamimcy.basic.queue;

/**
 * 队列 先进先出的数据结构 FIFO
 * 
 * @author chenyangm
 *
 * @param <E>
 */
public interface Queue<E> {

	/**
	 * 数据压入队列
	 * 
	 * @param e
	 */
	void enqueue(E e);

	/**
	 * 出队列
	 * 
	 * @return
	 */
	E dequeue();

	/**
	 * 获取对首的元素
	 * 
	 * @return
	 */
	E getFront();

	/**
	 * 获取当前队列的大小
	 * 
	 * @return
	 */
	int getSize();

	/**
	 * 判断是否为空
	 * @return
	 */
	boolean isEmpty();

}
