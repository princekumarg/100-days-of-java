package Loop;
import java.util.*;
public class prime_or_not {
    public static void main(String args[]) {
        int i=2;
        Scanner s=new Scanner(System.in);
        System.out.print("enter a number=");
        int n=s.nextInt();
        while(i<n){
              if(n%i==0){
                     System.out.println("is not prime");
                     return;
               }
               i=i+1;
        }
        System.out.println("is prime");

    }
}
