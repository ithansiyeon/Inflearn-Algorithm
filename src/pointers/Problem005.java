package pointers;

import java.util.Scanner;

/**
 * 6. 최대 길이 연속부분수열
 */
public class Problem005 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(), k = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		solution(n, k, arr);
	}

	public static void solution(int n, int k, int[] arr) {
		int result = 0;
		for (int i = 0; i < n; i++) {
			int max = arr[i] == 1 ? 1:0;
			int num = 0;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] == 1) max++;
				if (arr[j] == 0) {
					if (num < k) {
						num++;
						max++;
					} else {
						break;
					}
				}
			}
			result = Math.max(result, max);
		}
		System.out.println(result);
	}
}
