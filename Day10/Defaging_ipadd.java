package Day10;
import java.util.*;
public class Defaging_ipadd {
    public static String defangip(String str) {
        StringBuilder s=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='.'){
                s.append("[.]");
            }
            else{
                s.append(str.charAt(i));
            }
        }
        return s.toString();
    }
    public static void main(String args[]) {
        System.out.println(defangip("1.1.1.1"));
    }
}
