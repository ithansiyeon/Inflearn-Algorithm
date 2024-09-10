package 문자열;

import java.util.Scanner;

/**
 * 8. 유효한 필린드롬
 */
public class Problem008 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(solution(scanner.nextLine()));
	}

	public static String solution(String str) {
		String s = str.toUpperCase().replaceAll("[^A-Z]", "");
		return s.equals(new StringBuilder(s).reverse().toString()) ? "YES" : "NO";
	}
}
