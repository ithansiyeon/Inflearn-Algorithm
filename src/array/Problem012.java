package array;

import java.util.Scanner;

/**
 * 12. 멘토링
 */
public class Problem012 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] s = scanner.nextLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int[][] square = new int[m][n];
		for (int i=0; i<m; i++) {
			String row = scanner.nextLine();
			String[] s1 = row.split(" ");
			for (int j=0; j<n; j++) {
				square[i][j] = Integer.parseInt(s1[j]);
			}
		}
		System.out.println(solution(square, n, m));
	}

	public static int solution(int[][] arr, int n, int m) {
        int result = 0;
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				int cnt = 0;
                for (int k=0; k<m; k++) {
					int p1 = 0;
					int p2 = 0;
					for (int l=0; l<n; l++) {
						if (arr[k][l] == i) p1 = l + 1;
						if (arr[k][l] == j) p2 = l + 1;
					}
					if (p1 < p2) cnt++;
				}
				if (cnt == m) {
					result++;
				}
			}
		}
        return result;
    }
}
