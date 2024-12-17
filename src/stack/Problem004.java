package stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * 4. 후위식 연산(postfix)
 */
public class Problem004 {
	public static void main(String[] args) {
		Scanner knb = new Scanner(System.in);
		solution(knb.nextLine());
	}

	public static void solution(String str) {
		Queue<Character> queue = new LinkedList<>();
		Stack<Integer> stack = new Stack<>();
		int result = 0;
		for (Character c : str.toCharArray()) {
			queue.add(c);
		}

		while (!queue.isEmpty()) {
			Character poll = queue.poll();
			if (poll == '*' || poll == '/') {
				Integer num1 = stack.pop();
				Integer num2 = stack.pop();
				if (poll == '*') {
					stack.push( num1 * num2);
				} else {
					stack.push(num2 / num1);
				}
			} else if (poll == '+' || poll == '-') {
				Integer num1 = stack.pop();
				Integer num2 = stack.pop();
				if (poll == '+') stack.push(num1 + num2);
				else stack.push(num2 - num1);
			} else {
				stack.push(Integer.parseInt(String.valueOf(poll)));
			}
		}
		System.out.println(stack.pop());
	}
}
