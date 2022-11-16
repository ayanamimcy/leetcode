package com.ayanamimcy.basic.stack;

/**
 * 定义一个stack接口，用来规范需要实现的方法
 * 
 * @author chenyangm
 *
 */
public interface Stack<E> {

	/**
	 * 将元素推入栈中
	 * 
	 * @param e
	 */
	void push(E e);

	/**
	 * 判断栈是不是为空
	 * 
	 * @return
	 */
	boolean isEmpty();

	/**
	 * 获取队列的大小
	 * 
	 * @return
	 */
	int getSize();

	/**
	 * 取出栈中的元素
	 * 
	 * @return
	 */
	E pop();

	/**
	 * 查看当前栈顶的元素
	 * 
	 * @return
	 */
	E peek();

}
