package stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * 1. 올바른 괄호
 */
public class Problem001 {
	public static void main(String[] args) {
		Scanner knb = new Scanner(System.in);
		System.out.println(solution(knb.nextLine()));
	}

	public static String solution(String str) {
		Stack<Character> stack = new Stack<>();
		for (char c : str.toCharArray()) {
			if (c == '(') stack.push(c);
			else {
				if (!stack.isEmpty()) stack.pop();
				else return "NO";
			}
		}
		if (stack.isEmpty()) return "YES";
		else return "NO";
	}
}
