package sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 9. 뮤직비디오(결정알고리즘)
 */
public class Problem009_1 {
	public static void main(String[] args) {
		Scanner knb = new Scanner(System.in);
		int n = knb.nextInt();
		int m = knb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = knb.nextInt();
		}
		System.out.println(solution(n, m, arr));
	}

	public static int solution(int n, int m, int[] arr) {
		int result = Integer.MAX_VALUE;
		int max = Arrays.stream(arr).sum();
		while (true) {
			int sum = 0;
			int cnt = 1;
			for (int i = 0; i < n; i++) {
				if (sum + arr[i] <= max) {
					sum += arr[i];
				} else {
					sum = arr[i];
					cnt++;
				}
			}
			if (cnt <= m) {
				result = max;
				max--;
			} else {
				return result;
			}
		}
	}
}
