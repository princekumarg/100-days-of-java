package Day9;
import java.util.*;
public class No_changing {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println(Integer.bitCount(a^b));
        System.out.println(a^b);
    }
}