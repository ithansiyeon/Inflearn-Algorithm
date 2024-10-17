package array;

import java.util.Scanner;

/**
 * 10. 봉우리
 */
public class Problem010 {
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
		int result = 0;
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				int cnt = 0;
				if (i + 1 < n) {
					if (square[i][j] > square [i+1][j]) cnt++;
				} else {
					cnt++;
				}
				if (0 <= i-1  && i -1 < n) {
					if (square[i][j] > square[i-1][j]) cnt++;
				} else {
					cnt++;
				}
				if (j + 1 < n) {
					if (square[i][j] > square[i][j+1]) cnt++;
				} else {
					cnt++;
				}
				if (0 <= j-1 && j-1 < n) {
					if (square[i][j] > square[i][j-1]) cnt++;
				} else {
					cnt++;
				}
				if (cnt == 4) result++;
			}
		}
		System.out.println(result);
	}
}
