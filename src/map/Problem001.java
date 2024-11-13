package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 1. 학급 회장(해쉬)
 */
public class Problem001 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		kb.nextLine();
		char[] arr = kb.nextLine().toCharArray();
		solution(n, arr);
	}

	public static void solution(int n, char[] arr) {
		Character result = '\0';
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i=0;i<n;i++) {
			char c = arr[i];
			if (!map.containsKey(c)) map.put(c, 1);
			else {
				map.put(c, map.get(c) + 1);
			}
		}
		int max = 0;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (max < entry.getValue()) {
				max = entry.getValue();
				result = entry.getKey();
			}
		}
		System.out.println(result);
	}
}
