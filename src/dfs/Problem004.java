package dfs;

import java.util.Arrays;
import java.util.Scanner;

public class Problem004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i =0; i< n; i++) {
            arr[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        System.out.println(solution(n, arr, m));
    }

    public static int solution(int n, int[] arr, int m) {
        int[] dp = new int[m+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= m; i++) {
            for (int c : arr) {
                if (i - c >= 0 && dp[i-c] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - c] + 1);
                }
            }
        }
        return dp[m];
    }
}