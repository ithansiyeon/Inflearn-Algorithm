package 문자열;

import java.util.Scanner;

public class Problem006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(replaceString(scanner.nextLine()));
    }

    public static String replaceString(String str) {
        String answer = "";
        if (!str.isEmpty()) {
            if (Character.isLowerCase(str.charAt(0))) {
                str.toCharArray();
                for (char c : str.toCharArray()) {
                    if (!answer.contains(Character.toString(c))) {
                        answer += c;
                    }
                }
            }
        }
        return answer;
    }
}
