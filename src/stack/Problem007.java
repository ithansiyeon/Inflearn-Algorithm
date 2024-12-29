package stack;

import java.util.*;

/**
 * 7. 교육과정 설계
 */

public class Problem007 {
	public static void main(String[] args) {
		Scanner knb = new Scanner(System.in);
		String need = knb.nextLine();
		String plan = knb.nextLine();
		System.out.println(solution(need, plan));
	}

	public static String solution(String need, String plain) {
		Queue<Character> queue = new LinkedList<>();
		for (Character c : need.toCharArray()) {
			queue.add(c);
		}
		for (Character c : plain.toCharArray()) {
			if (queue.contains(c)) {
				if (c != queue.poll()) return "NO";
			}
		}
		if (queue.isEmpty()) return "YES";
		else return "NO";
	}
}
