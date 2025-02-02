package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 7. 좌표 정렬
 */
public class Problem007 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		int[][] result = solution(n, arr);
		for (int i = 0; i < n; i++) {
			System.out.println(result[i][0] + " " + result[i][1]);
		}
	}

	public static int[][] solution(int n, int[][] arr) {
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0]) {
					return Integer.compare(o1[1], o2[1]);
				}
				return Integer.compare(o1[0], o2[0]);
			}
		});
		return arr;
	}
}