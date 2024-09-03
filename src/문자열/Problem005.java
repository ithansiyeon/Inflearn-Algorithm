package 문자열;

import java.util.Scanner;

/**
 * 특정 문자 뒤집기
 */
public class Problem005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(reverse(scanner.nextLine()));
    }

    public static String reverse(String str) {
        char[] charArray = str.toCharArray();
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {
            if (!(Character.isAlphabetic(charArray[lt]))) {
                lt++;
            } else if (!(Character.isAlphabetic(charArray[rt]))) {
                rt--;
            } else {
                char temp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = temp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(charArray);
    }

}
