package map;

import java.util.*;

/**
 * 5. K번째 큰 수
 */
public class Problem005 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(), k = kb.nextInt();
		Integer[] arr = new Integer[n];
		for (int i = 0; i < n; i ++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(solution(n, k, arr));
	}

	public static int solution(int n, int k, Integer[] arr) {
		int answer = -1;
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				for (int l = j+1; l < n; l++) {
					Tset.add(arr[i] + arr[j] + arr[l]);
				}
			}
		}
		int cnt = 0;
		for (int x : Tset) {
			cnt++;
			if (cnt == k) return x;
		}
		return answer;
	}
}
