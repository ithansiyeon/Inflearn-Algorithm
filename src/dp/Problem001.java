package dp;

import java.util.Scanner;

public class Problem001 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(solution(n));
	}

	public static int solution(int n) {
		int[] dp = new int[n+1];
		dp[1] = 1;
		dp[2] = 2;
		for (int i = 3; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}
}
