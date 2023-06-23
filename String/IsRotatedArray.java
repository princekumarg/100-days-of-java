package String;

public class IsRotatedArray {
    public static boolean rotateString(String s, String goal) {
        return (s.length()==goal.length() && (s+s).contains(goal));
    }
    public static void main(String[] args) {
        String s="abcde";
        String goal="cdabe";
        System.out.println(rotateString(s, goal));
    }
}
