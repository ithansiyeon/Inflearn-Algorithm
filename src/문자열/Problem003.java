package 문자열;

import java.util.Scanner;

public class Problem003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(new Problem003().solution(scanner.nextLine()));
    }

    public String longWord(String str) {
        String[] words = str.split(" ");
        int longest = -1;
        String longWord = "";
        for (String word : words) {
            if (word.length() > longest) {
                longest = word.length();
                longWord = word;
            }
        }
        return longWord;
    }

    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
        while ((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        if (str.length() > m) answer = str;
        return answer;
    }
}
