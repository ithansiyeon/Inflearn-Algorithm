package array;

import java.util.Scanner;

/**
 * 3. 가위바위보
 */
public class Problem003 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		solution(n, scanner.nextLine(), scanner.nextLine());
	}

	public static void solution(int n, String aStr, String bStr) {
		String[] answer = new String[n];
		// 1:가위, 2:바위, 3:보
		String[] aArr = aStr.split(" ");
		String[] bArr = bStr.split(" ");
		// 무승부는 D 출력
		// 가위(1) 바위(2):B
		// 가위(1) 보(3):A
		// 바위(2) 가위(1):A
		// 바위(2) 보(3):B
		// 보(3) 가위(1):B
		// 보(3) 바위(2):A
		for (int i=0; i<n; i++) {
			int i1 = Integer.parseInt(aArr[i]);
			int i2 = Integer.parseInt(bArr[i]);
			if (i1 == i2) answer[i] = "D";
			else if (i1 < i2) {
				answer[i] = "B";
			} else {
				answer[i] = "A";
			}
			if (i1 == 3 && i2 == 1) answer[i] = "B";
			else if (i1 == 1 && i2 == 3) answer[i] = "A";
		}

		for (String s : answer) {
			System.out.println(s);
		}
	}
}
