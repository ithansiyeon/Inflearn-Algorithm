package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Problem002 {
	static int[] dx = {0, 0, 1, -1};
	static int[] dy = {1, -1, 0, 0};
	static int sum = 0;
	static int[][] arr;
	static int m;
	static int n;

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		m = kb.nextInt();
		n = kb.nextInt();
		arr = new int[n][m];
		Queue<Point> queue = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = kb.nextInt();
				if (arr[i][j] == 0) {
					sum++;
				} else if (arr[i][j] == 1) {
					queue.add(new Point(i, j));
				}
			}
		}
		if (sum == 0) System.out.println(0);
		else System.out.println(bfs(m, n, queue));
	}

	public static int bfs(int m, int n, Queue<Point> queue) {
		int level = 0;
		while (!queue.isEmpty()) {
			if (sum == 0) break;
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				Point poll = queue.poll();
				int x = poll.x, y = poll.y;
				for (int j = 0; j < 4; j++) {
					int nx = x + dx[j], ny = y + dy[j];
					if (0 <= nx && nx < n && 0 <= ny && ny < m && arr[nx][ny] == 0) {
						sum--;
						arr[nx][ny] = 1;
						queue.add(new Point(nx, ny));
					}
				}
			}
			level++;
//			System.out.println("sum : " + sum + " , level: " + level);
		}
		return sum != 0 ? -1 : level;
	}
}
