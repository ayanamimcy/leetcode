package com.ayanamimcy.basic.stack;

import com.ayanamimcy.basic.arrays.Array;

/**
 * 基于数组实现一个栈
 * 
 * @author chenyangm
 *
 * @param <E>
 */
public class ArrayStack<E> implements Stack<E> {

	private Array<E> stack;

	public ArrayStack() {
		stack = new Array<>();
	}

	public ArrayStack(int capcity) {
		this.stack = new Array<>(capcity);
	}

	@Override
	public void push(E e) {
		// TODO Auto-generated method stub
		this.stack.addLast(e);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.stack.isEmpty();
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return this.stack.getSize();
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return this.stack.deleteLast();
	}

	/**
	 * 获取stack的总容量
	 * 
	 * @return
	 */
	public int getCapcity() {
		return this.stack.getCapcity();
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return this.stack.get(getSize() - 1);
	}

	@Override
	public String toString() {
		return "ArrayStack [stack=" + stack + "]";
	}

}
