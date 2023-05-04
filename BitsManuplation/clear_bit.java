package Day9;
import java.util.*;
public class clear_bit {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int i=s.nextInt();
        int mask=~(1<<i);
        int n=mask&x;
        System.out.println(n);
    }
}
