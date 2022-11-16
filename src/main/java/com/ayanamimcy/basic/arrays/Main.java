package com.ayanamimcy.basic.arrays;

public class Main {

	public static void main(String[] args) {
		Array<Integer> array = new Array<>(20);

		for (int i = 0; i < 20; i++) {
			array.addLast(i);
		}

		System.out.println(array);

		array.add(1, 200);
		System.out.println(array);
		
		array.deleteLast();
		System.out.println(array);
		array.deleteLast();
		System.out.println(array);

	}

}
