package Day7;
import java.util.*;
public class fibonacci {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();
        System.out.println("fibonacci"+fibo(n));
    }
    public static int fibo(int n) {
        if(n<=1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    } 
}
