package array;

import java.util.Scanner;

/**
 * 11. 임시반장정하기
 */
public class Problem011 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		int[][] square = new int[n][5];
		for (int i=0; i<n; i++) {
			for (int j=0; j<5; j++) {
				square[i][j] = scanner.nextInt();
			}
		}
		solution(n, square);
	}

	public static void solution(int n, int[][] square) {
		int max = 0, answer = 0;
		System.out.println(square[0][3]);
		for (int i=0; i<n; i++) {
			int cnt = 0;
			for (int j=0; j<n; j++) {
				for (int k=0; k<5; k++) {
					if (square[i][k] == square[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if (cnt > max) {
				max = cnt;
				answer = i;
			}
		}
		System.out.println(answer+1);
	}
}
