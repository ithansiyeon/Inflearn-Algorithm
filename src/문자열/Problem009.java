package 문자열;

import java.util.Scanner;

/**
 * 9. 숫자만 추출
 */
public class Problem009 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(numberFilter(scanner.nextLine()));
	}

	public static int numberFilter(String str) {
		int answer;
		answer = Integer.parseInt(str.replaceAll("[^0-9]", ""));
		return answer;
	}
}
