package Day5;
import java.util.*;
public class no_of_zeros_in_factorial {
   /* public static int factorial_count_0(int n) {
        int fact=1;
        for(int i=2;i<=n;i++){
            fact=fact*i;
        }
        int count=0;
        while(fact%10==0){
            fact=fact/10;
            count++;
        }
        return count;
    }*/
    public static int Traling_zeros(int a) {
        int count=0;
        for(int i=5;i<=a;i=i*5){
            count=count+a/i;
        }
        return count;
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number");
        //int n=s.nextInt(); 
        //System.out.println(factorial_count_0(n));
        int a=s.nextInt();
        System.out.println(Traling_zeros(a));
    }
}
