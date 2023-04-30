package Array;
import java.util.*;
public class subarray_sum_at_index {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the index=");
        int v=s.nextInt();
        System.out.print("Enter the sum=");
        int sum=s.nextInt();
        int []pri=new int[v];
        System.out.println("Enter the index element");
        for(int k=0;k<v;k++){
            int a=s.nextInt();
            pri[k]=a;
        }
        for(int k=0;k<v;k++){
            int sub_sum=0;
            for(int p=k;k<v;k++){
                sub_sum=sub_sum+pri[p];
                if(sub_sum==sum){
                    System.out.println("sum found between "+p+" and "+k);
                }
            }
        }
    }
}
