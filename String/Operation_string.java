package String;
import java.util.*;
public class Operation_string {
    public static void main(String args[]) {
        String str="Prince";
        String s=new String("Prince");
        System.out.println(str.charAt(3));
        System.out.println(str.length());
        String a=str.substring(1);
        String b=str.substring(1, 3);
        System.out.println(a);
        System.out.println(b);
        String c=" "+"kumar";
        System.out.println(str+c);
        String d=" ".concat("Agrawal");
        System.out.println(str+d);
        System.out.println(str==s);
        System.out.println(str.equals(s));

    }
}
