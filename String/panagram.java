package String;

public class panagram {
    public static boolean checkIfpangram(String s) {
        int n = s.length();
        boolean hash[] = new boolean[26];
        int count = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (!hash[c - 'a']) {
                count++;
            }
            hash[c - 'a'] = true;
        }
        return count == 26;
    }

    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfpangram(s));

    }
}
