package sorting;

import java.util.Scanner;

/**
 * 3. 삽입 정렬
 */
public class Problem003 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		for (int i : solution(n, arr)) System.out.print(i +" ");
	}

	public static int[] solution(int n, int[] arr) {
		for (int i = 1; i < n; i++) {
			int tmp = arr[i], j;
			for (j = i-1; j >= 0; j--) {
				if (tmp < arr[j]) {
					arr[j + 1] = arr[j];
				} else {
					break;
				}
			}
			arr[j + 1] = tmp;
		}
		return arr;
	}
}
