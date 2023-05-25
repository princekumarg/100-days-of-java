package BitsManuplation;
import java.util.*;
public class even {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        if((n&1)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
}
