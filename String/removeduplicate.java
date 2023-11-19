package String;

import java.util.Arrays;
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

    public static char maxoccchar(String s) {
        int[] arr = new int[256];
        int max = 0;
        char ans = ' ';
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i)] > max) {
                max = arr[s.charAt(i)];
                ans = s.charAt(i);
            }
            if (arr[s.charAt(i)] == max && s.charAt(i) < ans) {
                ans = s.charAt(i);
            }
        }
        return ans;
    }

    public static char maxoccchar2(String s) {
        Map<Character, Integer> m = new HashMap<>();
        int max = 0;
        char res = ' ';
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            m.put(ch, m.getOrDefault(ch, 0) + 1);
            if (m.get(ch) > max) {
                max = m.get(ch);
                res = ch;
            }
            if (m.get(ch) == max && ch < res) {
                res = ch;
            }
        }
        return res;

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
        // System.out.println(removeduplicateinarray(s));
        // System.out.println(vowelateven(s));
        // System.out.println(nonrepeatingCharacter(s));
        System.out.println(maxoccchar(s));
        System.out.println(maxoccchar2(s));
    }
}
