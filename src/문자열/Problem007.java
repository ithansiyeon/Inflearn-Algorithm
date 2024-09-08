package 문자열;

import java.util.Scanner;

/**
 * 7. 회문 문자열
 */
public class Problem007 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(solution(scanner.nextLine()));
	}

	public static String solution(String s) {
		String sLowerCase = s.toLowerCase();
		StringBuilder sb = new StringBuilder(sLowerCase);
		StringBuilder reverse = sb.reverse();
		return reverse.toString().equals(sLowerCase)? "YES" : "NO";
	}
}
