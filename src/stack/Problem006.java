package stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 6. 공주 구하기
 */
public class Problem006 {
	public static void main(String[] args) {
		Scanner knb = new Scanner(System.in);
		int n = knb.nextInt(), k = knb.nextInt();
		solution(n, k);
	}

	public static void solution(int n, int k) {
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			queue.add(i);
		}

		while (queue.size() != 1) {
			for (int i = 1; i <= k; i++) {
				Integer pop = queue.poll();
				if (i != k) {
					queue.add(pop);
				}
			}
		}
		System.out.println(queue.poll());
	}
}

