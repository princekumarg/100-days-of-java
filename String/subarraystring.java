package String;

import java.util.ArrayList;
import java.util.List;

public class subarraystring {
    public static char[] maxconsequtive(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }
        char maxChar = s.charAt(0);
        char currChar = s.charAt(0);
        int maxCount = 1;
        int currCount = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == currChar) {
                currCount++;
            } else {
                currChar = s.charAt(i);
                currCount = 1;
            }
            if (currCount > maxCount) {
                maxCount = currCount;
                maxChar = currChar;
            }
        }
        return new char[] { maxChar, (char) maxCount };

    }

    public static char[] findMaxConsecutiveChar(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }
        char maxChar = s.charAt(0);
        char currChar = s.charAt(0);
        int maxCount = 1;
        int currCount = 1;
        int maxIndex = 0;
        int currIndex = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == currChar) {
                currCount++;
            } else {
                currChar = s.charAt(i);
                currCount = 1;
                currIndex = i;
            }
            if (currCount > maxCount) {
                maxCount = currCount;
                maxChar = currChar;
                maxIndex = currIndex;
            }
        }
        return new char[] { maxChar, (char) maxCount, (char) maxIndex, (char) (maxIndex + maxCount - 1) };
    }

    public static void main(String[] args) {
        String s = "aabbbccddddd";
        char[] res = maxconsequtive(s);
        System.out.println(res[0] + ":" + (int) res[1]);
        char[] res1 = findMaxConsecutiveChar(s);
        System.out
                .println("char" + res1[0] + "count" + (int) res1[1] + "start" + (int) res1[2] + "end" + (int) res1[3]);
    }
}
