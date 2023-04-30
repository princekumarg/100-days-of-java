package Array;
import java.util.*;
public class prefix_sum_fibonacci {
    public static int get_array(int []arr,int l,int r) {
        int sum=0;
        for(int i=l;i<=r;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    public static int[] runningSum(int[] nums) 
    {
        int[] res= new int[nums.length];
        if(nums.length==0) return res;
        res[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            res[i]=res[i-1]+ nums[i];
        }
        return res;
    }

    public static void main(String args[]) {
        int []arr={2,1,3,4,5,6,7};
        int []nums={1,2,3,4,5,6,7};
        int []pri=runningSum(nums);
        for(int i=0;i<pri.length;i++){
            System.out.print(pri[i]+" ");
        }
        System.out.println();
        System.out.println(get_array(arr, 3, 5));
    }
}
