package Day2;
import java.util.*;
public class vowel {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the charcter=");
        char c=s.next().charAt(0);
        if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'){
            System.out.println("vowel");
        }
        else{
            System.out.println("consonent");
        }
    }
}
