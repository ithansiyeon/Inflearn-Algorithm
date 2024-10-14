package array;

import java.util.Scanner;

/**
 * 4. 피보나치 수열
 */
public class Problem004 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int x :solution(n)) System.out.print(x + " ");
	}

	public static int[] solution(int n) {
		int[] answer=new int[n];
		answer[0]=1;
		answer[1]=1;
		for(int i=2; i<n; i++){
			answer[i]=answer[i-2]+answer[i-1];
		}
		return answer;
	}
}
