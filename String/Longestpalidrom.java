package String;

public class Longestpalidrom {
    public static boolean ispalidrom(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static String longestpal(String s) {
        int max = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() + 1; j++) {
                String temp = s.substring(i, j);
                if (ispalidrom(temp)) {
                    if (temp.length() > max) {
                        max = temp.length();
                        ans = temp;
                    }
                }
            }
        }
        return ans;
    }

    public static String subend(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        return s.substring(start + 1, end);
    }

    public static String longestpalinfrm(String s) {
        if (s.length() <= 1) {
            return s;
        }
        String maxstr = s.substring(0, 1);
        for (int i = 0; i < s.length() - 1; i++) {
            String odd = subend(s, i, i);
            String even = subend(s, i, i + 1);
            if (odd.length() > maxstr.length()) {
                maxstr = odd;
            }
            if (even.length() > maxstr.length()) {
                maxstr = even;
            }
        }
        return maxstr;
    }

    public static void main(String[] args) {
        String s = "aaaabbaa";
        System.out.println(longestpal(s));
    }
}
