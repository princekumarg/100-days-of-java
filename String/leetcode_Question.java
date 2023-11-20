package String;

public class leetcode_Question {
    public static int indexoffirstindex(String s, String str) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == str.charAt(0)) {
                if (s.substring(i, str.length() + i).equals(str)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static boolean validpalidrom(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while (start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(currFirst)) {
                start++;
            } else if (!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }

    public static int maxsubstring(String s, String str) {
        int count = 1;
        while (s.contains(str.repeat(count))) {
            count++;
        } // .repat(2)==for "a" is "aa" two print two times
        return count;// count-1 also
    }

    public static String MergingString(String s, String str) {
        StringBuilder sb = new StringBuilder();
        int n = s.length() + str.length();
        for (int i = 0; i < n; i++) {
            if (i < s.length()) {
                sb.append(s.charAt(i));
            }
            if (i < str.length()) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "helloll";// "A man a plan, a canal: Panama"; for palindrom
        String str = "ll";
        System.out.println(indexoffirstindex(s, str));
        System.out.println(validpalidrom(s));
        System.out.println(maxsubstring(s, str));
        System.out.println(MergingString(s, str));
    }
}
