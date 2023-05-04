package Day9;
import java.util.*;
public class swap {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("before swap="+a+" "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swap="+a+" "+b);
    }
}
