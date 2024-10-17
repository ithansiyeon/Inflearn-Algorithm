package array;

import java.util.Scanner;

/**
 * 8. 등수구하기
 */
public class Problem008 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		solution(n, scanner.nextLine());
	}

	public static void solution(int n, String line) {
		String[] score = line.split(" ");
		int[] rank = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (rank[i] == 0) rank[i] = 1;
				if (Integer.parseInt(score[i]) < Integer.parseInt(score[j])) {
					rank[i] += 1;
				}
			}
		}
		for (int i : rank) {
			System.out.print(i + " ");
		}
	}
}
