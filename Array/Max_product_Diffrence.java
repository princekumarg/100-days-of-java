package Array;
import java.util.*;
public class Max_product_Diffrence {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int option1 = nums[0] * nums[1] * nums[nums.length - 1];
        int option2 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        return Math.max(option1, option2);
    }
    public static int maxdiff(int[] nums,int n) {
        int res=nums[1]-nums[0];
        for(int i=0;i<n-1;i++){
            for(int j=i+1;i<n;j++){
                if(nums[j]-nums[i]>res){
                    res=nums[j]-nums[i];
                }
            }
        }
        return res;
    }
    public static int maxdiffrrence(int[] nums,int n) {
        int maxvalue=nums[0],minval=nums[0];
        for(int j=1;j<n;j++){
            maxvalue=Math.max(maxvalue,nums[j]-minval);
            minval=Math.min(minval,nums[j]);
        }
        return maxvalue-minval;
    }
    public static void main(String args[]) {
        int []nums={2,3,4,5,6,7};
        System.out.println(maximumProduct(nums));
        System.out.println(maxdiff(nums,6));
        System.out.println(maxdiffrrence(nums,6));
    }
}
