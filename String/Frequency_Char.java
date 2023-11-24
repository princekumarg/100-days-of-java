package String;

import java.util.*;

public class Frequency_Char {
    static int SIZE = 26;

    public static void printCharWithFreq(String str) {
        int n = str.length();
        int[] freq = new int[SIZE];
        for (int i = 0; i < n; i++)
            freq[str.charAt(i) - 'a']++;
        for (int i = 0; i < n; i++) {
            if (freq[str.charAt(i) - 'a'] != 0) {
                System.out.print(str.charAt(i));
                System.out.print("=");
                System.out.print(freq[str.charAt(i) - 'a'] + " ");
                freq[str.charAt(i) - 'a'] = 0;
            }
        }
    }

    public static Map<Character, Integer> freqchar(String str) {
        Map<Character, Integer> m = new HashMap<>();
        int[] freq = new int[SIZE];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i) - 'a'] != 0) {
                m.put(str.charAt(i), freq[str.charAt(i) - 'a']);
                freq[str.charAt(i) - 'a'] = 0;
            }
        }
        return m;
    }

    public static int firstUniqChar(String s) {// find the first unique Char in string
        int n = s.length();
        int[] str = new int[26];
        for (int i = 0; i < n; i++)
            str[s.charAt(i) - 'a']++;
        for (int i = 0; i < n; i++) {
            if (str[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static int getcount(String str, int N) {
        int n = str.length();
        int count = 0;
        int[] freq = new int[SIZE];
        freq[str.charAt(0) - 'a']++;
        for (int i = 1; i < n; i++) {
            if (str.charAt(i - 1) != str.charAt(i)) {
                freq[str.charAt(i) - 'a']++;
            }
        }
        for (int i : freq) {
            if (i == N) {
                count++;
            }
        }
        return count;

    }

    public static void main(String args[]) {
        // String str = "geeksforgeeks";
        String s = "Leetcode";
        // printCharWithFreq(str);
        System.out.println(firstUniqChar(s));
        System.out.println(freqchar(s));
        System.out.println(getcount(s, 2));
    }

}
