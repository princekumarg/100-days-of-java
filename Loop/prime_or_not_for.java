package Loop;
import java.util.*;
public class prime_or_not_for {
    public static void main(String args[]) {
        int i=2;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();
        for(;i<n;i++){
            if(n%i != 0){
                System.out.println("not a prime");
                return;
            }
        }
        System.out.println("is prime");
    }
}
