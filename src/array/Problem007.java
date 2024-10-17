package array;

import java.util.Scanner;

/**
 * 7. 점수계산
 */
public class Problem007 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		solution(n, scanner.nextLine());
	}

	public static void solution(int n, String line) {
		String[] score = line.split(" ");
		int result = 0;
		int before = Integer.parseInt(score[0]);
		int cnt = 1;
		for (int i=0; i<n; i++) {
			int i1 = Integer.parseInt(score[i]);
			if (i1 == 1) {
				result+=cnt;
				cnt++;
			} else if (i1 == 0) {
				cnt = 1;
			}
		}
		System.out.println(result);
	}
}
