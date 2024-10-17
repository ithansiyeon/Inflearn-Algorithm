package array;

import java.util.Scanner;

/**
 * 9. 격자판 최대합
 */
public class Problem009 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		int[][] square = new int[n][n];
		for (int i=0; i<n; i++) {
			String[] strLine = scanner.nextLine().split(" ");
			for (int j=0; j<strLine.length; j++) {
				square[i][j] = Integer.parseInt(strLine[j]);
			}
		}
		solution(n, square);
	}

	public static void solution(int n, int[][] square) {
		int max = 0;
		for (int i=0; i<n; i++) {
			int row_sum = 0;
			int col_sum = 0;
			for (int j=0; j<n; j++) {
				// 행
				row_sum += square[i][j];
				//열
				col_sum += square[j][i];
			}
			max = Math.max(max, Math.max(row_sum, col_sum));
		}
		int sum1 = 0;
		int sum2 = 0;
		for (int i=0; i<n; i++) {
			sum1 += square[i][i];
			sum2 += square[i][n - 1 - i];
		}
		max = Math.max(max, Math.max(sum1, sum2));
		System.out.println(max);
	}
}
