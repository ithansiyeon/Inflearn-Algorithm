package array;

import java.util.Scanner;

/**
 * 6. 뒤집은 소수
 */
public class Problem006 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		solution(n, scanner.nextLine());
	}

	public static void solution(int n, String line) {
		String[] arr = line.split(" ");
		for (int i = 0; i < n; i++) {
			StringBuilder sb = new StringBuilder(arr[i]);
			int i1 = Integer.parseInt(sb.reverse().toString());
			boolean loop = false;
			for (int j=2; j<=Math.sqrt(i1); j++) {
				if (i1 % j == 0) {
					loop = true;
					break;
				}
			}
			if (!loop && i1 !=1 && i1!=0) System.out.print(i1 + " ");
		}
	}
}
