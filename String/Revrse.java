package String;

import java.util.*;

public class Revrse {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String nul = " ";
        String s1 = "adbbda";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            nul = ch + nul;
        }
        System.out.println("Revrse=" + nul);
        System.out.println("ispal=" + (ispal(s1)));
    }

    public static boolean ispal(String s1) {
        int begin = 0;
        int end = s1.length() - 1;
        while (begin < end) {
            if (s1.charAt(begin) != s1.charAt(end)) {
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }
}
