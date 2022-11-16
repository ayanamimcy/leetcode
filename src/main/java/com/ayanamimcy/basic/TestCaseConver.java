package com.ayanamimcy.basic;

import java.util.Random;

public class TestCaseConver {

	private static int X_MAX = 1001;
	private static int Y_MAX = 1001;

	private static int VALUE_MAX = 11;

	public static void main(String[] args) {

		int x, y;

		Random random = new Random();

		x = random.nextInt(X_MAX);
		y = random.nextInt(Y_MAX);

		System.out.println(y + " " + x);
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				int nextInt = random.nextInt(VALUE_MAX);
				System.out.print(nextInt);
				if (j != x - 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
