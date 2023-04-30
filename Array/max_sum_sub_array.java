package Array;
import java.util.*;
public class max_sum_sub_array {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");//for public max_sum
        int n=s.nextInt();//for public max sum
        int []arr=new int[n];//for public
        int []nums={1,2,3,5,4};//for maxim kandra algorithm
        int max=0;//for public
        System.out.println("Enter for public array");
        for(int i=0;i<n;i++){
            int a=s.nextInt();
            arr[i]=a;
        }
        for(int i=0;i<nums.length;i++){
            int sum=0;// for public
            for(int j=i;j<nums.length;j++){
                sum=sum+arr[i];
                if(sum>max){
                    max=sum;
                }
            }
        }
        System.out.println("The max sum is="+max);
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
