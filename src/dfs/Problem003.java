package dfs;

import java.util.Scanner;

public class Problem003 {
	static int n = 0, m = 0, max = 0;
	static int[] score;
	static int[] times;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		score = new int[n];
		times = new int[n];
		for (int i = 0; i < n; i++) {
			score[i] = scanner.nextInt();
			times[i] = scanner.nextInt();
		}
		dfs(0, 0, 0);
		System.out.println(max);
	}

	private static void dfs(int index, int sum, int time) {
		if (time > m) return;
		max = Math.max(sum, max);
		if (index >= n) return;

		dfs(index + 1, sum, time);
		dfs(index + 1, sum + score[index], time + times[index]);
	}
}
