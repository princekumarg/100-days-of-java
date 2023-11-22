package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

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

    public static String sortingthestring(String str2) {
        String ans = "";
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) >= '0' && str2.charAt(i) <= '9') {
                ans += "";
            } else {
                ans += str2.charAt(i);
            }
        }
        char[] arr = ans.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
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

    public static int isvowels(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1 ? 1 : 0;
    }

    public static boolean cheakhalfisalike(String s) {
        int len = s.length() / 2;
        int count1 = 0, count2 = 0;
        for (int i = 0; i < len; i++) {
            count1 += isvowels(s.charAt(i));
            count2 += isvowels(s.charAt(i));
        }
        return count1 == count2;
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
                if (res.equals(comp)) {// by this we can compare the string the values
                    return true;
                }

            }
        }
        return false;
    }

    public static boolean substringcontain1(String str, String comp) {
        boolean res = str.contains(comp);
        return res;
    }

    public static String removeduplicate(String s) {
        Set<Character> hs = new LinkedHashSet<>();
        for (int i = 0; i < s.length(); i++) {
            hs.add(s.charAt(i));
        }
        String ans = "";
        for (char x : hs) {
            ans += x;
        }
        return ans;
    }

    public static char maxoccchar(String s) {
        int[] arr = new int[256];
        int max = 0;
        char res = ' ';
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
            if (arr[s.charAt(i)] > max) {
                max = arr[s.charAt(i)];
                res = s.charAt(i);
            }
            if (arr[s.charAt(i)] == max && s.charAt(i) < res) {
                res = s.charAt(i);
            }
        }
        return res;
    }

    public static char nonreptingchar(String s) {
        Map<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            m.put(ch, m.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (m.get(ch) == 1) {
                return ch;
            }
        }
        return '$';
    }

    public static String uppertolower(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                ans += (char) (s.charAt(i) + 32);// ans+=s.toLowerCase();
            } else {
                ans += (char) (s.charAt(i) - 32);
            }
        }
        return ans;
    }

    public static String upperlower(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                ans += s.toLowerCase();
            } else {
                ans += s.toUpperCase();
            }
        }
        return ans;
    }

    public static String deffangaddress(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.') {
                ans += "[.]";
            } else {
                ans += str.charAt(i);
            }
        }
        return ans;
        // return s.replace('.',"[.]");
    }

    public static String goalparser(String str1) {
        // str1=str1.replace("()","o");
        // str1=str1.replace("(al)","al");
        String ans = "";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == 'G') {
                ans += "G";
            } else if (str1.charAt(i) == '(' && str1.charAt(i + 1) == ')') {
                ans += "o";
            } else if (str1.charAt(i) == '(' && str1.charAt(i + 1) == 'a' && str1.charAt(i + 2) == 'l'
                    && str1.charAt(i + 3) == ')') {
                ans += "al";
            }
        }
        return ans;
    }

    public static boolean isrotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        return (s1 + s1).contains(s2);
    }

    public static void main(String[] args) {
        String s = "aaabbcccc$";
        String str = "1.1.1.1";
        char temp = 'b';
        String comp = "abb";
        String str1 = "G()(al)";
        String str2 = "is2 sentence4 This1 a3";
        String s3 = "bbaaacccc$";
        System.out.println(count(s, temp));
        System.out.println(reverse(s));
        System.out.println(palindrom(s));
        System.out.println(remove(s, temp));
        System.out.println(removevaluealphabet(s));
        System.out.println(vowelateven(s));
        System.out.println(reversevowel(s));
        System.out.println(substringcontain(s, comp));
        System.out.println(substringcontain1(s, comp));
        System.out.println(removeduplicate(s));
        System.out.println(maxoccchar(s));
        System.out.println(nonreptingchar(s));
        System.out.println(uppertolower(s));
        System.out.println(deffangaddress(str));
        System.out.println(goalparser(str1));
        System.out.println(sortingthestring(str2));
        System.out.println(cheakhalfisalike(s));
        System.out.println(upperlower(s));
        System.out.println(isrotation(s, s3));
    }
}
