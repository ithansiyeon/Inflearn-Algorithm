package sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 8. 이분검색
 */

public class Problem008 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(solution(n, m , arr));
	}

	public static int solution(int n, int m, int[] arr) {
		int mid = 0;
		int left = 0, right = n - 1;
		Arrays.sort(arr);

		while (left <= right) {
			mid = (left + right) / 2;
			if (arr[mid] < m) {
				left = mid + 1;
			} else if (arr[mid] == m) {
				break;
			} else {
				right = mid - 1;
			}
		}
		return mid+1;
	}
}
