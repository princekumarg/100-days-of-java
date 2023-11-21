package String;

public class leetcode_Question {
    public static int indexoffirstindex(String s, String str) {
        for (int i = 0; i < (s.length() - str.length()); i++) {
            if (s.charAt(i) == str.charAt(0)) {
                if (s.substring(i, str.length() + i).equals(str)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int Noofwords(String[] arr, String s) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (s.contains(arr[i]) == true) {
                count++;
            }
        }
        return count;
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

    public static String reverseprefix(String s, char ch) {
        int index = s.indexOf(ch);
        if (index == -1) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(s.substring(0, index + 1));
        sb.reverse();
        sb.append(s.substring(index + 1));
        return sb.toString();
    }

    public static int lengthoflastword(String s) {
        int first = 0;
        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) != ' ' && s.charAt(i - 1) != ' ') {
                first = i;
                break;
            }
        }
        String temp = s.substring(first).trim();
        return temp.length();// String.trim() is reomve all the space
    }

    public static boolean stepstring(String s) {
        int updown = 0;
        int leftright = 0;
        for (char c : s.toCharArray()) {
            switch (c) {
                case 'U':
                    updown++;
                    break;
                case 'D':
                    updown--;
                    break;
                case 'L':
                    leftright++;
                    break;
                case 'R':
                    leftright--;
                    break;
            }
        }
        return (updown == 0 && leftright == 0);
    }

    public static void main(String[] args) {
        String s = "helloll";// "A man a plan, a canal: Panama"; for palindrom
        String str = "ll";
        String arr[] = { "ll", "he", "lo", "p" };
        System.out.println(indexoffirstindex(s, str));
        System.out.println(validpalidrom(s));
        System.out.println(maxsubstring(s, str));
        System.out.println(MergingString(s, str));
        System.out.println(reverseprefix(s, 'o'));
        System.out.println(lengthoflastword(s));
        System.out.println(Noofwords(arr, s));
    }
}
