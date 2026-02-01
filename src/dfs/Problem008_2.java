package dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem008_2 {
	public static int[] dx = {-1, 1, 0, 0};
	public static int[] dy = {0, 0, 1, -1};
	public static int[][] board, dis;

	public class Point {
		int x;
		int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		board = new int[8][8];
		dis = new int[8][8];
		for (int i = 1; i < 8; i++) {
			for (int j = 1; j < 8; j++) {
				int num = kb.nextInt();
				board[i][j] = num;
				dis[i][j] = num;
			}
		}
		Problem008_2 main = new Problem008_2();
		main.bfs();
		if (dis[7][7] == 0) System.out.println(-1);
		else System.out.println(dis[7][7]);
	}

	public void bfs() {
		Queue<Point> queue = new LinkedList<>();
		queue.offer(new Point(1, 1));
		board[1][1] = 1;
		while (!queue.isEmpty()) {
			Point poll = queue.poll();
			int x = poll.x, y = poll.y;
			for (int i = 0; i< 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (0 < nx && nx < 8 && 0 < ny && ny < 8 && board[nx][ny] == 0) {
					board[nx][ny] = 1;
					queue.offer(new Point(nx, ny));
					dis[nx][ny] = dis[x][y] + 1;
				}
			}
		}
	}
}
