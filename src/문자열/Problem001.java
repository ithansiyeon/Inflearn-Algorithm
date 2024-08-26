package 문자열;

import java.util.Scanner;

public class Problem001 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\\n");
        String string = scan.next().toLowerCase();
        char c = scan.next().charAt(0);
        String string2 = string.replace(Character.toString(c).toLowerCase(), "");
        System.out.println(string.length() - string2.length());

        Problem001 T = new Problem001();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        char t = kb.next().charAt(0);
        System.out.println(T.solution(str,t));
    }

    public int solution(String string, char c) {
        int answer = 0;
        string = string.toUpperCase();
        c = Character.toUpperCase(c);
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == c) {
                answer++;}
        }
        return answer;
    }
}
