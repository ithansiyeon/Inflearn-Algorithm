package array;

import java.util.Scanner;

/**
 * 2. 보이는 학생
 */
public class Problem002 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		solution(n, scanner.nextLine());
	}

	public static void solution(int n, String str) {
	    String[] s = str.split(" ");
		int height = Integer.parseInt(s[0]);
		int count = 1;
		for (int i = 1; i < n; i++) {
			if (height < Integer.parseInt(s[i])) {
				count++;
				height = Integer.parseInt(s[i]);
			}
		}
		System.out.println(count);
	}
}
