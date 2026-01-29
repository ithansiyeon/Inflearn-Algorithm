package dfs;

import java.util.*;

public class Problem004_2 {
	static int result = Integer.MAX_VALUE;
	static int n = 0;
	static int m = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		Integer[] arr = new Integer[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		Arrays.sort(arr, Collections.reverseOrder());
		m = scanner.nextInt();
		solution(n, arr, m);
		System.out.println(result);
	}

	public static void dfs(int l, int sum, Integer[] arr) {
		if (sum > m) return;
		if (l >= result) return;
		if (sum == m) result = Math.min(result, l);
		else {
			for (int i = 0; i < n; i++) {
				dfs(l + 1, arr[i] + sum, arr);
			}
		}
	}

	public static void solution(int n, Integer[] arr, int m) {
		int sum = 0;
		int l = 0;
		for (int i = 0; i < n; i++) {
			dfs(l + 1, arr[i] + sum, arr);
		}
	}
}