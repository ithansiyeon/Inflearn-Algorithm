package pointers;

import java.util.Scanner;

/**
 * 1. 두 배열 합치기(two pointers algorithm)
 */
public class Problem001 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		String[] arrN = scanner.nextLine().split(" ");
		int m = scanner.nextInt();
		scanner.nextLine();
		String[] arrM = scanner.nextLine().split(" ");
		solution(n, arrN, m, arrM);
	}

	public static void solution(int n, String[] arrN, int m, String[] arrM) {
		int[] arr = new int[n + m];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < arrN.length && j < arrM.length) {
			int i1 = Integer.parseInt(arrN[i]);
			int i2 = Integer.parseInt(arrM[j]);
			if (i1 < i2) {
				arr[k] = i1;
				i++;
			} else if (i1 > i2) {
				arr[k] = i2;
				j++;
			} else {
				arr[k] = i1;
				k++;
				arr[k] = i2;
				i++;
				j++;
			}
			k++;
		}
		while (i < arrN.length) {
			arr[k] = Integer.parseInt(arrN[i]);
			i++;
			k++;
		}
		while (j < arrM.length) {
			arr[k] = Integer.parseInt(arrM[j]);
			j++;
			k++;
		}
		for (int i1 : arr) {
			System.out.print(i1 + " ");
		}
	}
}
