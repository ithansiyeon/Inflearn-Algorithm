package dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem008 {
	public static int[][] arr = new int[8][8];

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		arr = new int[8][8];
		for (int i = 1; i < 8; i++) {
			for (int j = 1; j < 8; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.println(bfs());
	}

	public static int bfs() {
		Queue<int[]> queue = new LinkedList<>();
		arr[1][1] = 1;
		queue.offer(new int[]{1, 1});
		int[] dx = {0, 0, 1, -1};
		int[] dy = {1, -1, 0, 0};
		int level = 0;
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				int[] cur = queue.poll();
				int x = cur[0];
				int y = cur[1];
				if (x == 7 && y == 7) return level;
				for (int j = 0; j < 4; j++) {
					int x1 = x + dx[j];
					int y1 = y + dy[j];
					if (0<x1 && x1<8 && 0<y1 && y1<8) {
						if (arr[x1][y1] == 0) {
							arr[x1][y1] = 1;
							queue.offer(new int[]{x1, y1});
						}
					}
				}
			}
			level++;
		}
		return -1;
	}
}
