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
		char[] charArray = str.toLowerCase().toCharArray();
		String answer = "";
		for (char c : charArray) {
			if (c >= 97 && c <= 122) {
				answer += c;
			}
		}
		return answer.equals(new StringBuilder(answer).reverse().toString()) ? "YES" : "NO";
	}
}
