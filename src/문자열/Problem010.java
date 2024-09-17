package 문자열;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 10. 가장 짧은 문자거리
 */
public class Problem010 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] s = str.split(" ");
		solution(s[0], s[1].charAt(0));
	}

	public static void solution(String s, char t) {
		ArrayList<Integer> list = new ArrayList<>();
		List<Integer> l = new ArrayList<>();
		int cnt = 0;
		for (char c : s.toCharArray()) {
			list.add(1000);
			if (c == t) l.add(cnt);
			cnt++;
		}

		cnt = 0;
		for (char c : s.toCharArray()) {
			for (int i : l) {
				if (list.get(cnt) >= Math.abs(cnt - i)) {
					list.set(cnt, Math.abs(cnt - i));
				}
			}
			cnt++;
		}

		for (Integer i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
