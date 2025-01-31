package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 6. 장난꾸러기
 */

public class Problem006 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		solution(n, arr);
	}

	public static void solution(int n, int[] arr) {
		List<Integer> result = new ArrayList<>();
		int[] tmp = arr.clone();
		Arrays.sort(tmp);
		for (int i = 0; i < n; i++) {
			if (tmp[i] != arr[i]) result.add(i + 1);
		}
		for (int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i) + " ");
		}
    }
}
