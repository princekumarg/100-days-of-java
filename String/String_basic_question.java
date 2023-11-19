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
        char ch[] = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(ch);
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

    public static boolean isvowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
                || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'O'
                || ch == 'U') {
            return true;
        }
        return false;
    }

    public static String reversevowel(String s) {
        char ch[] = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if (!isvowel(ch[start])) {
                start++;
            } else if (!isvowel(ch[end])) {
                end--;
            } else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(ch);
    }

    public static boolean substringcontain(String s, String comp) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String res = s.substring(i, j);
                if (res.equals(comp)) {// by this we can compare the values
                    return true;
                }

            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "aaabbcccc$";
        char temp = 'b';
        String comp = "abb";
        System.out.println(count(s, temp));
        System.out.println(reverse(s));
        System.out.println(palindrom(s));
        System.out.println(remove(s, temp));
        System.out.println(removevaluealphabet(s));
        System.out.println(vowelateven(s));
        System.out.println(reversevowel(s));
        System.out.println(substringcontain(s, comp));
    }
}
