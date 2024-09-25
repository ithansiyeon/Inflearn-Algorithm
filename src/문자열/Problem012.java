package 문자열;

import java.util.Scanner;

/**
 * 12. 암호
 */

public class Problem012 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		solution(Integer.parseInt(scanner.nextLine()), scanner.nextLine());
	}

	public static void solution(int size, String str) {
		StringBuilder answer = new StringBuilder();
		String replaceVar = str.replaceAll("#", "1").replaceAll("\\*", "0");
		for (int i = 0; i < size * 7; i += 7) {
			answer.append((char) Integer.parseInt(replaceVar.substring(i, i + 7), 2));
		}
		System.out.println(answer);
    }
}
