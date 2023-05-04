package Day9;
import java.util.*;
public class updating_bit {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the operation");
        int oper=s.nextInt();
        System.out.println("Enter the number");
        int n=s.nextInt();
        System.out.println("Enter the postion");
        int i=s.nextInt();
        int mask=1<<i;
        if(oper==1){
            int x=mask|n;
            System.out.println(x);
        }
        else{
            int bitmask=~(mask);
            int y=bitmask & n;
            System.out.println(y);
        }
    }
}
