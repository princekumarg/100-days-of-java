package Day8;
import java.util.*;
public class max_sum_sub_array {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            int a=s.nextInt();
            arr[i]=a;
        }
        System.out.println("Maximum sum sub array="+max_sum_sub(arr));
    }
    public static int  max_sum_sub(int arr[]) {
        int n=arr.length;
        int max_sum=Integer.MIN_VALUE,curr_sum=0;
        for(int i=0;i<n;i++){
            curr_sum=curr_sum+arr[i];
            if(max_sum<curr_sum){
                max_sum=curr_sum;
            }
            if(curr_sum<0){
                max_sum=0;
            }
        }
        return max_sum;
    }
}
