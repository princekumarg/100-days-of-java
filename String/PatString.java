package String;

public class PatString {
    public static void PatString2(String str, String pat) {
        int n = str.length();
        int m = pat.length();
        for (int i = 0; i < n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (pat.charAt(j) != str.charAt(i + j)) {
                    break;
                }
                if (j == m) {
                    System.out.println(i + " ");
                }
            }
        }
    }

    public static void PatString1(String str, String pat) {
        int n = str.length();
        int m = pat.length();
        for (int i = 0; i <= n - m;) {
            int j;
            for (j = 0; j < m; j++) {
                if (pat.charAt(j) != str.charAt(i + j)) {
                    break;
                }
            }
            if (j == m) {
                System.out.println(i + " ");
            }
            if (j == 0) {
                i++;
            } else {
                i = i + j;
            }
        }
    }

    public static void main(String[] args) {
        String str = "ABCABCD";
        String pat = "ABCD";
        PatString2(str, pat);
        System.out.println();
        PatString1(str, pat);
    }
}
