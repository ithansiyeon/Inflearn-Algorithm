package sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 5. 중복 확인
 */
public class Problem005 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(solution(n, arr));
	}

	public static String solution(int n, int[] arr) {
		String result = "";
		Arrays.sort(arr);
		for (int i = 0; i < n-1; i++) {
			if (arr[i] == arr[i + 1]) {
				return "D";
			}
		}
		return "U";
	}
}
