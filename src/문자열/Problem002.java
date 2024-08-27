package 문자열;

import java.util.Scanner;

/**
 * 대소문자 변환
 */

public class Problem002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Problem002 problem002 = new Problem002();
        problem002.printTranslate(scanner.nextLine());
    }

    public void printTranslate(String str) {
        String result = "";
        for (char c:str.toCharArray()) {
            if (c >= 97 && c <= 122) result += (char)(c - 32); // - 하는 순간 char는 정수가 됨
            else result += (char)(c + 32);
        }
        System.out.println(result);
    }
}
