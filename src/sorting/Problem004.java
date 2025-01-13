package sorting;

import java.util.Scanner;

/**
 * 4. Least Recently Used
 */
public class Problem004 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt(), n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		for (int i : solution(s, n, arr)) System.out.print(i + " ");
	}

	public static int[] solution(int size, int n , int[] arr) {
		int[] cached = new int[size];
		for (int i = 0; i < n; i++) {
			int index = -1;
			for (int j = 0; j < size; j++) {
				if (arr[i] == cached[j]) index = j;
			}
			if (index != -1) {
				for (int j = index; j > 0; j--) {
					cached[j] = cached[j - 1];
				}
			} else {
				for (int j = size - 1; j > 0; j--) {
					cached[j] = cached[j - 1];
				}
			}
			cached[0] = arr[i];
		}
		return cached;
	}
}
