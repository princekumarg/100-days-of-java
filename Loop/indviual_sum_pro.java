package Day3;
import java.util.*;
public class indviual_sum_pro {
    public static void main(String agrs[]) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number=");
        int n=s.nextInt();
        int sum=0;
        int pro=1;
        while(n!=0){
            int rem=n%10;
            n=n/10;
            sum=sum+rem;
            pro=pro*rem;
        }
        System.out.println("The individual sum="+sum);
        System.out.println("The individual product"+pro);
    }
}
