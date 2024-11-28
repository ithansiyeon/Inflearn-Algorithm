package map;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 4. 모든 아나그램 찾기
 */

public class Problem004 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		solution(scanner.nextLine(), scanner.nextLine());
	}

	public static void solution(String str, String subStr) {
		int result = 0;
		HashMap<Character, Integer> am = new HashMap<>();
		HashMap<Character, Integer> bm = new HashMap<>();

		for (int i = 0; i < subStr.length(); i++) {
			char c1 = subStr.charAt(i);
			am.put(c1, am.getOrDefault(c1, 0) + 1);
			char c2 = str.charAt(i);
			bm.put(c2, bm.getOrDefault(c2, 0) + 1);
		}

		if (am.equals(bm)) result++;
		int rt = subStr.length();
		int lt = 0;
		for (int i = rt; i < str.length(); i++) {
			char c1 = str.charAt(lt);
			bm.put(c1, bm.get(c1)-1);
			if (bm.get(c1) == 0) bm.remove(c1);
			char c2 = str.charAt(i);
			bm.put(c2, bm.getOrDefault(c2, 0) + 1);
			if (am.equals(bm)) result++;
			lt++;
		}
		System.out.println(result);
	}
}
