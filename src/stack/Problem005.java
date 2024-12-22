package stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * 5. 쇠막대기
 */

public class Problem005 {
	public static void main(String[] args) {
		Scanner knb = new Scanner(System.in);
		solution(knb.nextLine());
	}

	public static void solution(String line) {
		Stack<Character> stack = new Stack<Character>();
		int cnt = 0;
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == '(') stack.push('(');
			else {
				stack.pop();
				if (line.charAt(i-1) == '(') cnt += stack.size();
				else cnt++;
			}
		}
		System.out.println(cnt);
	}
}
