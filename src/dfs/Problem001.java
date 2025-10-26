package dfs;

import java.util.Scanner;

public class Problem001 {
	public static int num;
	public static int[] arr;
	public static boolean found = false;

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		num = kb.nextInt();
		arr = new int[num];
		int total = 0;
		for (int i = 0; i < num; i++) {
			arr[i] = kb.nextInt();
			total += arr[i];
		}

		if (total % 2 != 0) {
			System.out.println("NO");
			return;
		}
		dfs(0, 0, total / 2);
		System.out.println(found ? "YES" : "NO");
	}

	public static void dfs(int index, int sum, int target) {
		if (found) return;
		if (sum > target) return;

		if (index == num) {
			if (sum == target) found = true;
			return;
		}

		dfs(index + 1, sum, target);
		dfs(index + 1, sum + arr[index], target);
	}
}
