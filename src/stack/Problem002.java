package stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * 2. 괄호 문자 제거
 */
public class Problem002 {
	public static void main(String[] args) {
		Scanner knb = new Scanner(System.in);
		solution(knb.nextLine());
	}

	public static void solution(String str) {
		String result = "";
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				stack.push(str.charAt(i));
			} else if (str.charAt(i) == ')') {
				while (stack.peek() != '(') {
					stack.pop();
				}
				stack.pop();
			} else {
				stack.push(str.charAt(i));
			}
		}

		for (int i = 0; i < stack.size(); i++) {
			System.out.print(stack.get(i));
		}
	}
}
