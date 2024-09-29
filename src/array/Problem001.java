package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 큰 수 출력하기
 */

public class Problem001 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		solution(Integer.parseInt(scanner.nextLine()), scanner.nextLine());
	}

	public static void solution(int n, String str) {
		String[] s = str.split(" ");
		if (n == 1) {
			System.out.println(s[0]);
		} else {
			List<String> answer = new ArrayList<String>();
			answer.add(s[0]);
			for (int i = 1; i < n; i++) {
				int a = Integer.parseInt(s[i]);
				int b = Integer.parseInt(s[i - 1]);
				if (b < a) {
					answer.add(s[i]);
				}
			}
			for (int i = 0; i < answer.size(); i++) {
				if (i != answer.size() - 1) {
					System.out.print(answer.get(i) + " ");
				} else {
					System.out.print(answer.get(i));
				}
			}
		}
	}
}
