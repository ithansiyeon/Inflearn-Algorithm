package window;

import java.util.Scanner;

/**
 * 3. 최대 매출
 */
public class Problem001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		solution(n, k, arr);
	}

	public static void solution(int n, int k, int[] arr) {
		int answer, sum=0;
		for(int i=0; i<k; i++) sum+=arr[i];
		answer=sum;
		for(int i=k; i<n; i++){
			System.out.println(i);
			sum+=(arr[i]-arr[i-k]);
			answer=Math.max(answer, sum);
		}
		System.out.println(answer);
	}
}
