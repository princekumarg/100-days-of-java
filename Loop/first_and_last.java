package Day3;
import java.util.*;
public class first_and_last {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number=");
        int n=s.nextInt();
        int last=n%10,first,sum;
        while(n>=10){
            n=n/10;
        }
        first=n;
        sum=first+last;
        System.out.println("The sum is="+sum);
    }
}
