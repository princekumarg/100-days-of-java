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

    public static String deffangaddress(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                ans += "[.]";
            } else {
                ans += s.charAt(i);
            }
        }
        return ans;
        // return s.replace('.',"[.]");
    }

    public static void main(String[] args) {
        // String s = "codeleet";
        int arr[] = { 4, 5, 6, 7, 0, 2, 1, 3 };
        // System.out.println(shuffle(s, arr));
        String s = "1.1.1.1";
        System.out.println(deffangaddress(s));
    }
}
