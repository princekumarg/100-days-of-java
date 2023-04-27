package Array;
import java.util.*;
public class max_min {
    public static int KandleAlgorithm(int[] nums){
        int max_sum = Integer.MIN_VALUE;
        int cur=0;
        for(int x:nums)
        {
            if(cur<0) 
            cur=0;
            cur += x;
            max_sum =  Math.max(max_sum , cur);
        }
        return max_sum;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            int a=s.nextInt();
            arr[i]=a;
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(KandleAlgorithm(arr));
    }
}
