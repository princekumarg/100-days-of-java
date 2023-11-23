package String;

import Arrays.missingAndrepting;

public class Geek_question {
    public static int Miniindex(String s, String str) {
        for (int i = 0; i < s.length(); i++) {
            if (str.contains(String.valueOf(s.charAt(i)))) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        String str = "set";
        System.out.println(Miniindex(s, str));
    }
}
