package 문자열;

import java.util.Scanner;

/**
 * 11. 문자열 압축
 */
public class Problem011 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		solution2(scanner.nextLine());
	}

	public static void solution(String str) {
		String answer = String.valueOf(str.charAt(0));
		char before = ' ';
		int count = 0;
		for (char c : str.toCharArray()) {
			if (before == ' ') before = c;
			if (answer.charAt(answer.length() - 1) != before && (count == 0 || count == 1)) {
				answer += before;
			}
			if (c == before) {
				count++;
			} else if (c != before) {
				if (count > 1) answer += count;
				else if (!answer.contains(String.valueOf(before))) answer += before;
				before = c;
				count = 1;
			}
		}
		if (!answer.contains(String.valueOf(before))) answer += before;
		if (count > 1) answer += count;
		System.out.println(answer);
	}

	public static void solution2(String s) {
		String answer = "";
		s = s + " ";
		int cnt = 1;
		for (int i = 0; i < s.length()-1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
                cnt++;
            } else {
                answer += s.charAt(i) + String.valueOf(cnt > 1 ? cnt : "");
                cnt = 1;
            }
		}
		System.out.println(answer);
	}
}
