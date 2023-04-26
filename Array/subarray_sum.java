package Array;
import java.util.*;
public class subarray_sum {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the index=");
        int n=s.nextInt();
        System.out.print("Enter the sum=");
        int sum=s.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the index element");
        for(int i=0;i<n;i++){
            int a=s.nextInt();
            arr[i]=a;
        }
        for(int i=0;i<n;i++){
            int sub_sum=0;
            for(int j=i;j<n;j++){
                sub_sum=sub_sum+arr[j];
                if(sub_sum==sum){
                    System.out.println("sum found between "+i+" and "+j);
                }
            }
        }
    }
}
