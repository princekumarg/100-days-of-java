package String;
import java.util.*;
public class Revrse {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String nul=" ";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            nul=ch+nul;
        }
        System.out.println("Revrse="+nul);
    }
}
