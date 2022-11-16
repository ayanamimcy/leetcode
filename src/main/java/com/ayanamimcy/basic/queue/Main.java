package com.ayanamimcy.basic.queue;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	// 二维地图
	private static int[][] data;

	private static int[] stepx = new int[] { -1, 0, 1 };

	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		String[] split = line.split(" ");

		// 1. 定义范围边界
		int x = Integer.valueOf(split[1]);
		int y = Integer.valueOf(split[0]);

		// 2. 定义数组字段，获取输入并进行初次处理
		data = new int[y][x];

		for (int i = 0; i < y; i++) {
			String nextLine = sc.nextLine();
			String[] split2 = nextLine.split(" ");

			for (int j = 0; j < x; j++) {
				data[i][j] = Integer.valueOf(split2[j]);
			}
		}
		
		System.out.println(bfs(x - 1, y - 1));
	}
	
	private static int bfs(int rowx, int rowy) {
		
		LinkedList<Point> queue = new LinkedList<>();
		
		int[][] result = new int[rowy + 1][rowx + 1];
		for (int i = 0; i <= rowx; i++) {
			queue.push(new Point(i, 0));
			result[0][i] = data[0][i];
		}
		int x, y;

		int maxResult = 0;

		while (!queue.isEmpty()) {

			Point point = queue.pop();
			
			int tempResult = result[point.y][point.x];

			if (point.getY() == rowy) {
				if (tempResult > maxResult) {
					maxResult = tempResult;
				}
				continue;
			}

			for (int i = 0; i < stepx.length; i++) {

				x = point.x + stepx[i];
				y = point.y + 1;

				if (x >= 0 && y >= 0 && x <= rowx && y <= rowy) {
					queue.push(new Point(x, y));
					result[y][x] = tempResult + data[y][x];
				}

			}

		}

		return maxResult;
	}

}