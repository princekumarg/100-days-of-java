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

    public static int LongestValidParanthesis(String str) {
        int left = 0;
        int right = 0;
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                max = Math.max(max, 2 * right);
            } else if (right > left) {
                left = right = 0;
            }
        }
        left = right = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                max = Math.max(max, 2 * left);
            } else if (left > right) {
                left = right = 0;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        String str = "({})";
        System.out.println(isBalanced(str));
        System.out.println(LongestValidParanthesis(str));
    }
}
