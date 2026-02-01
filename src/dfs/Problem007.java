package dfs;

import java.util.Scanner;

public class Problem007 {
	public static int[][] arr = new int[8][8];
	public static int cnt = 0;

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		arr = new int[8][8];
		for (int i = 1; i < 8; i++) {
			for (int j = 1; j < 8; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		solution();
		System.out.println(cnt);
	}

	public static void dfs(int x, int y) {
		if (x == 7 && y == 7) {
			cnt++;
			return;
		}
		int[] dx = {0, 0, 1, -1};
		int[] dy = {1, -1, 0, 0};
		for (int i = 0; i < 4; i++) {
			int x1 = x + dx[i];
			int y1 = y + dy[i];
			if (x1 > 0 && x1 < 8 && 0 < y1 && y1 < 8) {
				if (arr[x1][y1] == 0) {
					arr[x1][y1] = 1;
					dfs(x1, y1);
					arr[x1][y1] = 0;
				}
			}
		}
	}

	public static void solution() {
		arr[1][1] = 1;
		dfs( 1, 1);
	}
}
