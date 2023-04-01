package Day5;
import java.util.*;
public class armstrong {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=s.nextInt();
        int original=n,arm=0;
        while(n!=0){
            int rem=n%10;
            n=n/10;
            arm=arm+rem*rem*rem;
        }
        if(original==arm){
            System.out.println("Armstrong");
        }
        else{
        System.out.println("Not a Armstrong");
        }
    }
}
