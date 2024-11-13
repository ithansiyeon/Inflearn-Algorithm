package pointers;

import java.util.Scanner;

/**
 * 5. 연속된 자연수의 합
 */
public class Problem004 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		solution(n);
	}

	public static void solution(int n) {
		int result = 0;
		for (int i=1; i<n-1;i++) {
			int sum = i;
			for (int j=i+1; j<n-1; j++) {
				sum += j;
				if (sum == n) {
					result++;
				} else if (sum >= n) {
					break;
				}
			}
		}
		System.out.println(result);
	}
}
