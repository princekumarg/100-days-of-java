package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
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
        Map<Character, Integer> m = new HashMap<>();
        int n = S.length();
        for (int i = 0; i < n; i++) {
            char ch = S.charAt(i);
            m.put(ch, m.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            char ch = S.charAt(i);
            if (m.get(ch) == 1) {
                return ch;
            }
        }
        return '$';
    }

    public static String removespaceinstring(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                ans += s.charAt(i);
            }
        }
        return ans;
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
        System.out.println(removespaceinstring(s));
    }
}
