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

    public static void main(String[] args) {
        String s = "aaaabbaa";
        System.out.println(longestpal(s));
    }
}
