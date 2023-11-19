package String;

public class String_basic_question {
    public static int count(String s, char temp) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == temp) {
                count++;
            }
        }
        return count;
    }

    public static String reverse(String s) {
        int start = 0;
        int end = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
        while (start <= end) {
            char temp = s.charAt(start);
            sb.setCharAt(start, s.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
        return sb.toString();
    }

    public static boolean palindrom(String s) {
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

    public static String remove(String s, char temp) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != temp) {
                ans += s.charAt(i);
            }
        }
        return ans;
    }

    public static String removevaluealphabet(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                ans += s.charAt(i);
            } else if (s.charAt(i) != ' ') {// remove space in string
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
                    || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'O'
                    || s.charAt(i) == 'U') {
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
        String s = "aaabbcccc$";
        char temp = 'b';
        System.out.println(count(s, temp));
        System.out.println(reverse(s));
        System.out.println(palindrom(s));
        System.out.println(remove(s, temp));
        System.out.println(removevaluealphabet(s));
        System.out.println(vowelateven(s));
    }
}
