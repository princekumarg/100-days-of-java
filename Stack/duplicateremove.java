package Stack;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class duplicateremove {

    public static String removeDuplicate1(String s) {
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        for (Character c : set) {
            sb.append(c);
        }
        return sb.reverse().toString();
    }

    public static String removeDuplicate2(String s) {
        int last[] = new int[256];
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }
        boolean seen[] = new boolean[256];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            int curr = s.charAt(i) - 'a';
            if (seen[curr])
                continue;
            while (!st.isEmpty() && st.peek() > curr && i < last[st.peek()]) {
                seen[st.pop()] = false;
            }
            st.push(curr);
            seen[curr] = true;
        }
        StringBuilder sb = new StringBuilder();
        for (int i : st) {
            sb.append((char) ('a' + i));
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "bbcad";
        System.out.println(removeDuplicate1(s));
        System.out.println(removeDuplicate2(s));
    }

}
