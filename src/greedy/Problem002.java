package greedy;

import java.util.Scanner;

public class Problem002 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int m = kb.nextInt();
		System.out.println(solution(m));
	}

	public static int solution(int m) {
		int[] dp = new int[m+2];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 3;
		for (int i = 4; i <= m+1; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
//			System.out.println(dp[i]);
		}
		return dp[m+1];
	}
}
