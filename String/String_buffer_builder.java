package String;
import java.util.*;
public class String_buffer_builder {
    public static void main(String args[]) {
        String str="Prince";
        StringBuilder str1=new StringBuilder(str);
        StringBuffer str2=new StringBuffer(str);
        str1.append("def");
        str1.setCharAt(0, 'd');
        System.out.println(str1);
        str2.reverse();
        System.out.println(str2);
        str2.append(" Kumar Agrawal");
        System.out.println(str2);
    }
}
