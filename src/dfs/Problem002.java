package dfs;

import java.util.Scanner;

public class Problem002 {
	static int c = 0, n = 0, total = 0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		c = scanner.nextInt();
		n = scanner.nextInt();
		int[] weight = new int[n];
		for (int i = 0; i < n ; i++) {
			weight[i] = scanner.nextInt();
		}
		dfs(0, 0, weight);
		System.out.println(total);
	}

	private static void dfs(int index, int sum, int[] weight) {

		if (sum > c) {
			return;
		}
		total = Math.max(sum, total);
		if (index >= n) return;
		dfs(index + 1, sum + weight[index], weight);
		dfs(index + 1, sum, weight);
	}
}
