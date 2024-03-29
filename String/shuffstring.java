package String;

public class shuffstring {
    public static String shuffle(String s, int arr[]) {
        char ch[] = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[arr[i]] = s.charAt(i);
        }
        return new String(ch);
        // String res=String.valueOf(ch);
        // return res;
    }

    public static boolean charArrayequal(String s1[], String s2[]) {
        return String.join("", s1).equals(String.join("", s2));
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int arr[] = { 4, 5, 6, 7, 0, 2, 1, 3 };
        System.out.println(shuffle(s, arr));
        String s1[] = { "a", "bc" };
        String s2[] = { "ab", "c" };
        System.out.println(charArrayequal(s1, s2));
    }
}
