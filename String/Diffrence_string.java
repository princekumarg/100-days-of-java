package String;

import java.util.Arrays;

//Diffrence in string means abcde and abcd is e
public class Diffrence_string {
    public static char findTheDifference(String s, String t) {
        char[] sortedS = s.toCharArray();
        char[] sortedT = t.toCharArray();
        Arrays.sort(sortedS);
        Arrays.sort(sortedT);
        for (int i = 0; i < s.length(); i++) {
            if (sortedS[i] != sortedT[i]) {
                return sortedT[i];
            }
        }
        return sortedT[s.length()];
    }

    public static void main(String[] args) {
        String s = "abcd", t = "abcde";
        char ans = findTheDifference(s, t);
        System.out.println(ans);
    }
}
