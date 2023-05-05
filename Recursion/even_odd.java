package Recursion;
import java.util.*;
public class even_odd {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number=");
        int n=s.nextInt();
        System.out.println(even(n));
        System.out.println("Even="+odd(n));
    }
    public static int even(int n) {
        if(n==0){
            return 0;
        }
        else{
            System.out.println(n);
            return even(n-2);
        }
    }
    public static int odd(int n) {
        if(n==1){
            return 1;
        }
        else{
            System.out.println(n);
            return odd(n-2);
        }
    }
}
