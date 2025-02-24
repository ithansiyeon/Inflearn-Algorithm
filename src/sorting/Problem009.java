package sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 9. 뮤직비디오(결정알고리즘)
 */
public class Problem009 {
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
		int result = 0;
		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();
		while (lt <= rt) {
			int mid = (lt + rt) / 2;
			if (count(arr, mid) <= m) {
				result = mid;
				rt = mid - 1;
			} else {
				lt = mid + 1;
			}
		}
		return result;
	}

	public static int count(int[] arr, int capacity) {
		int cnt = 1;
		int sum = 0;
		for (int x : arr) {
			if (sum + x > capacity) {
				cnt++;
				sum = x;
			} else {
				sum += x;
			}
		}
		return cnt;
	}
}
