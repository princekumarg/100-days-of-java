package String;
import java.util.*;
public class Goal_parser_interprtor {
    public static String interpret1(String str) {
        return str.replace("()", "o").replace("(al)", "al");
    }
    public static String interpret2(String str) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);
            if (c == 'G') {
                ans.append(c);
            } else if (c == '(') {
                ans.append(str.charAt(i + 1) == ')' ? "o" : "al");
            }
        }
        return ans.toString();
    }
    public static void main(String args[]) {
        System.out.println(interpret1("G()(al)"));
        System.out.println(interpret2("G()()(al)"));
    }
}
