package sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 10. 마구간 정하기(결정알고리즘)
 */

public class Problem010 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int c = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(solution(n, c, arr));
	}

	public static int solution(int n, int c, int[] arr) {
		int ans = 0;
		Arrays.sort(arr);
		int lt = 1;
		int rt = arr[n-1];
		while (lt <= rt) {
			int mid = (lt + rt) / 2;
            if (count(mid, arr) >= c) {
                ans = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
		}
		return ans;
	}

	public static int count(int mid, int[] arr) {
		int cnt = 1;
		int ep = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] - ep >= mid) {
				cnt++;
				ep = arr[i];
			}
		}
		return cnt;
	}
}
