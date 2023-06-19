package String;

public class Decrpt_String {
    public static String freqAlphabets(String s) {
        String ans = "";
        for (int i = 0; i < s.length();) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                ans += (char) (Integer.valueOf(s.substring(i, i + 2)) + 'a' - 1);
                i += 3;
            } 
            else {
                ans += (char) ((s.charAt(i) - '0') + 'a' - 1);
                i += 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="10#11#12";
        System.out.println(freqAlphabets(s));
    }
}
