package sorting;

import java.util.Scanner;

/**
 * 1. 선택 정렬
 */
public class Problem001 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		for (int a : solution(n, arr)) System.out.print(a + " ");
	}

	public static int[] solution(int n, int[] arr) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[i]) {
					int num = arr[i];
					arr[i] = arr[j];
					arr[j] = num;
				}
			}
		}
		return arr;
	}
}
