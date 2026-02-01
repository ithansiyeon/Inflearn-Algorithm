package dfs;

import java.util.Scanner;

public class Problem005 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int r = kb.nextInt();
		int[][] dp = new int[n+1][r+1];
//		System.out.println(solution(n, r));
		System.out.println(solution2(n, r, dp));
	}

	public static int dfs(int n, int r) {
		if (r == 0 || n == r) return 1;
		return dfs(n - 1, r - 1) + dfs(n - 1, r);
	}

	public static int solution(int n, int r) {
		return dfs(n, r);
	}

	public static int solution2(int n, int r, int[][] dp) {
		return memo(n, r, dp);
	}

	public static int memo(int n, int r, int[][] dp) {
		if (r == 0 || n == r) return 1;
		if (dp[n][r] != 0) return dp[n][r];
		else {
			dp[n][r] = memo(n - 1, r - 1, dp) + memo(n - 1, r, dp);
		}
		return dp[n][r];
	}
}
