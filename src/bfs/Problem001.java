package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 8. 송아지 찾기 1(BFS: 상태트리탐색)
 */

public class Problem001 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();
		int e = kb.nextInt();
		boolean[] ch = new boolean[10001];
		System.out.println(bfs(s, e, ch));
	}

	public static int bfs(int s, int e, boolean[] ch) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(s);
		ch[s] = true;
		int[] direct = {1, -1, 5};
		int L = 0;

		while (!queue.isEmpty()) {
			int len = queue.size();
			for (int i = 0; i < len; i++) {
				int current = queue.poll();
				for (int j = 0; j < 3; j++) {
					int next = current + direct[j];
					if (next == e) return L + 1;
					if (next >= 0 && next <= 10000 && !ch[next]) {
						queue.offer(next);
						ch[next] = true;
					}
				}
			}
			L++;
		}
		return -1;
	}
}
