package String;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeduplicate {
    public static String removeduplicateinarray(String s) {
        HashSet<Character> hs = new HashSet<>();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            hs.add(s.charAt(i));
        }
        for (Character ch : hs) {
            ans += ch;
        }
        return ans;

    }

    public static char nonrepeatingCharacter(String S) {
        char ans[] = new char[S.length() + 1];
        for (int i = 0; i < S.length(); i++) {
            ans[S.charAt(i)]++;
        }
        for (int i = 0; i < S.length(); i++) {
            if (ans[S.charAt(i)] == 1) {
                return S.charAt(i);
            }
        }
        return '$';
    }

    public static String vowelateven(String s) {
        String ans = "";
        int even = 0, odd = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I'
                    || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                if (even < s.length()) {
                    ans += s.charAt(even);
                    even += 2;
                }

            } else {
                if (odd < s.length()) {
                    ans += s.charAt(odd);
                    odd += 2;
                }

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "zxvczbtxyzvy";
        System.out.println(removeduplicateinarray(s));
        System.out.println(vowelateven(s));
        System.out.println(nonrepeatingCharacter(s));
    }
}
