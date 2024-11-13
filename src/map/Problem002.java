package map;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 2. 아나그램(해쉬)
 */
public class Problem002 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		char[] char1 = kb.nextLine().toCharArray();
		char[] char2 = kb.nextLine().toCharArray();
		System.out.println(solution(char1, char2));
	}

	public static String solution(char[] char1, char[] char2) {
		if (char1.length != char2.length) return "NO";
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		for (int i = 0; i < char1.length; i++) {
			if (!map1.containsKey(char1[i])) map1.put(char1[i], 0);
			else map1.put(char1[i], map1.get(char1[i]) + 1);
			if (!map2.containsKey(char2[i])) map2.put(char2[i], 0);
			else map2.put(char2[i], map2.get(char2[i]) + 1);
		}

		for (int i=0; i< char1.length; i++) {
			if (map1.get(char1[i]) != map2.get(char1[i])) return "NO";
		}
		return "YES";
	}
}
