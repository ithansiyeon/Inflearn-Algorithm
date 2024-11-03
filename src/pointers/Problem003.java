package pointers;

import java.util.Scanner;

/**
 * 4. 연속 부분수열
 */
public class Problem003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		solution(n, m , arr);
	}

	public static void solution(int n, int m, int[] arr) {
		int result = 0;
		for (int i = 0; i < n; i++) {
			int sum = arr[i];
			if (sum == m) {
				result++;
				continue;
			}
			for (int j = i+1; j < n; j++) {
				sum += arr[j];
				if (sum == m) {
					result++;
					break;
				} else {
					if (sum > m) break;
				}
			}

		}
		System.out.println(result);
	}
}
