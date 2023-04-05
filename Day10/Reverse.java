package Day10;
import java.util.*;
public class Reverse {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String rev=reverse(str);
        System.out.println(rev);    
    }
    public static String reverse(String str) {
        String revstr=" ";
        for(int i=str.length()-1;i>=0;i++){
            revstr=revstr+str.charAt(i);
        }
        return revstr;
    }
}
