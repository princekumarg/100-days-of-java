package Day3;
import java.util.*;
public class sum_of_mulitiplicationFactor {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0)
                sum=sum+i;   
        }
        System.out.println(sum);
    }
}
