package Stack;

import java.util.*;

public class validParathesis {
    public static boolean isBalanced(String str) {
        Stack<Character> s = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                s.push(str.charAt(i));
            } else {
                if (s.empty() == true) {
                    return false;
                } else if (matching(s.peek(), str.charAt(i)) == false) {
                    return false;
                } else {
                    s.pop();
                }
            }
        }
        return (s.empty() == true);
    }

    public static boolean matching(char a, char b) {
        return ((a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']'));
    }

    public static void main(String[] args) {
        String str = "({})";
        System.out.println(isBalanced(str));
    }
}
