package Time_complexity;
import java.util.*;
public class prime_number {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int n=s.nextInt();
        boolean prime_less=false;
        boolean prime_high=false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                prime_less=true;
                break;
            }
        }
        if(!prime_less){
            System.out.println(n+"=is a prime");
        }
        else{
            System.out.println(n+"=is not a prime");
        }
        for(int i=2;i<=n;i++){
            if(n%i==0){
                prime_high=true;
                return;
            }
        }
        if(!prime_high){
            System.out.println(n+"=is a prime");
        }
        else{
            System.out.println(n+"=is not a prime");
        }
    }
}
