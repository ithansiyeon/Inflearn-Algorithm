package 문자열;

import java.util.Scanner;

/**
 * 단어 뒤집기
 */
public class Problem004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            System.out.println(solution(s));
        }
    }

    public static String solution(String str) {
        String answer = "";
        for (int i = str.length(); i > 0; i--) {
            answer += String.valueOf(str.charAt(i-1));
        }
        return answer;
    }
}
