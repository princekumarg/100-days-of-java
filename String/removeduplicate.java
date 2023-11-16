package String;

import java.util.HashSet;

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

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(removeduplicateinarray(s));
    }
}
