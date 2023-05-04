package Day9;
import java.util.*;
public class set_bit {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int x=s.nextInt();
        int i=s.nextInt();
        int mask=1<<i;
        int n=mask|x;
        System.out.println(n);
    }
}
