package com.ayanamimcy.basic.arrays;

/**
 * 
 * 基于基本数组，封装一个数组类，来扩展数组的功能：
 * 
 * 1. 动态的扩容
 * 
 * 2. 提供更方便便捷的增删改查功能
 * 
 * tips：对一个数据结构的操作： 增删改查
 * 
 * @author chenyangm
 *
 */
public class Array<T> {

	private T[] data;
	private int size;

	// 创建构造函数，传入数组的容量，同时提供默认无参数的构造函数，传入默认容量
	public Array(int capcity) {
		this.data = (T[]) new Object[capcity];
	}

	public Array() {
		this(10);
	}

	// 获取元素数量
	public int getSize() {
		return size;
	}

	// 获取数组容量
	public int getCapcity() {
		return this.data.length;
	}

	// 判断数组是否为空
	public boolean isEmpty() {
		return this.size == 0;
	}

	// 在数组中最后的位置添加一个元素
	public void addLast(T element) {
		add(size, element);
	}

	// 在数组中的指定位置添加一个元素
	public void add(int index, T element) {
		if (index < 0 || index > getSize()) {
			throw new IllegalArgumentException("Add failed! index >=0 and index <=size");
		}

		for (int i = size - 1; i >= index; i--) {
			data[i + 1] = data[i];
		}
		data[index] = element;
		size++;
		if (getSize() == getCapcity()) {
			resize(getCapcity() * 2);
		}
	}

	// 获取某个索引的元素
	public T get(int index) {
		if (index < 0 || index >= getSize()) {
			throw new IllegalArgumentException("Get failed! index >=0 and index <=size");
		}
		return this.data[index];
	}

	// 删除某个元素
	public T delete(int index) {
		if (index < 0 || index >= getSize()) {
			throw new IllegalArgumentException("Delete failed! index >=0 and index <=size");
		}
		T result = data[index];
		for (int i = index; i < getSize(); i++) {
			data[i] = data[i + 1];
		}
		size--;
		// 删除后，最好将值设置为null，取消引用，便于垃圾回收
		data[size] = null;

		// 缩容
		if (getSize() < getCapcity() / 2) {
			resize(getCapcity() / 2);
		}

		return result;
	}
	
	// 删除第一个元素
	public T deleteFirst() {
		return delete(0);
	}

	// 删除最后一个元素
	public T deleteLast() {
		return delete(getSize() - 1);
	}

	// 删除对应的元素
	public void deleteElement(T element) {
		int index = find(element);
		if (index != -1) {
			delete(index);
		}
	}

	// 判断某个索引是否包含某个元素
	public boolean contains(T element) {
		int index = find(element);
		return index != -1;
	}

	// 查找某个元素的索引位置
	public int find(T element) {
		for (int i = 0; i < data.length; i++) {
			if (data[i].equals(element)) {
				return i;
			}
		}
		return -1;
	}

	private void resize(int capcity) {
		T[] newArray = (T[]) new Object[capcity];
		for (int i = 0; i < size; i++) {
			newArray[i] = data[i];
		}
		data = newArray;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("Array size is %d, capcity is %d \n", getSize(), getCapcity()));
		sb.append("[");
		for (int i = 0; i < size; i++) {
			sb.append(data[i]);
			sb.append(" ,");
		}
		sb.append("]");
		return sb.toString();
	}

}
