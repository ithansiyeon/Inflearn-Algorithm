package array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 5. 소수
 */
public class Problem005 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(solution(n));
	}

	public static int solution(int n) {
		boolean[] answer = new boolean[n+1];
		Arrays.fill(answer, false);
		answer[0] = true;
		answer[1] = true;

		// 1,2,3,4,5,6,7,8,9,10
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (!answer[i]) {
				for (int j=2; j<=n; j++) {
					if (i*j <= n) answer[i * j] = true;
				}
			}
		}
		int count = 0;
		for (int i=2;i< answer.length;i++) {
			if (!answer[i]){
				count++;
			}
		}
		return count;
	}
}
