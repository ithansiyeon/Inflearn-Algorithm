package pointers;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 2. 공통원소 구하기
 */
public class Problem002 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = kb.nextInt();
		}
		int m = kb.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = kb.nextInt();
		}
		solution(n, a, m, b);
	}

	public static void solution(int n, int[] a, int m, int[] b) {
		String result = "";
		Arrays.sort(a);
		Arrays.sort(b);
		int i = 0;
		int j = 0;
		while (i < n && j < m) {
			int i1 = a[i];
			int i2 = b[j];
			if (i1 < i2) i++;
			else if (i1 > i2) j++;
			else {
				result += i1 + " ";
				i++;
				j++;
			}
		}
		System.out.println(result);
	}
}
