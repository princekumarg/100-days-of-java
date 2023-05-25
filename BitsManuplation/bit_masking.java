package BitsManuplation;
import java.util.*;
public class bit_masking {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int x=s.nextInt();
        int i=s.nextInt();
        int mask=1<<i;
        if((x&mask)==0){
              System.out.println(0);
        }
        else{
            System.out.println(1);
        }
    }
}
