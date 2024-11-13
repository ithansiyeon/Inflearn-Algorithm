package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 3. 매출액의 종류
 */
public class Problem003 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(), k = kb.nextInt();
		int[] arr = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		solution(n, k, arr);
	}

	public static void solution(int n, int k, int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		//각 구간별 매출액의 종류를 출력
		HashMap<Integer, Integer> map = new HashMap<>();
		int cnt = 0;
		for (int i=0; i<k; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
				cnt += 1;
			} else {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
		}
		list.add(cnt);
		// 20 12 20 10 23 17 10
		for (int i=1; i<n-k+1; i++) {
			if (map.get(arr[i-1]) > 1) {
				map.put(arr[i - 1], map.get(arr[i - 1]) - 1);
			} else {
				cnt -= 1;
				map.remove(arr[i-1]);
			}

			if (!map.containsKey(arr[i+k-1])) {
				map.put(arr[i + k - 1], 1);
				cnt++;
			} else {
				map.put(arr[i + k - 1], map.get(arr[i + k - 1]) + 1);
			}
			list.add(cnt);
		}
		for (int i : list) System.out.print(i + " ");
	}
}
