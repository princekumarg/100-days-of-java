package Day6;
import java.util.*;
public class time_complixity {
    public static void main(String args[]) {
        //sum of number
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number=");
        int n=s.nextInt();
        int sum_n=0,sum_1;
        for(int i=0;i<=n;i++){
            sum_n=sum_n+i;
        }
        sum_1=(n*(n+1))/2;
        System.out.println("sum in o(n)="+sum_n);//for o(n)
        System.out.println("sum in o(1)="+sum_1);//for o(1)
    }
}
