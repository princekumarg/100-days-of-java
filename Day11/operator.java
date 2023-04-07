package Day11;
import java.util.*;
public class operator {
    public static void main(String args[]) {
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));

        System.out.println("a" + 1);
        System.out.println("prince" + new ArrayList<>());
        System.out.println("prince" + new Integer(56));
        String ans = new Integer(56) +" "+ new ArrayList<>();
        System.out.println(ans);
        System.out.println("a" + 'b');
    }
}
