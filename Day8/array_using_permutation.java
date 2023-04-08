package Day8;
import java.util.*;
public class array_using_permutation {
    public static int[] build_array_permutation(int []nums){
        int n=nums.length;
        int []ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            nums[i] *= n;
        }
        for(int i=0;i<n;i++){
            nums[i] += nums[nums[i]/n]/n;
        }
        for(int i=0;i<n;i++){
            nums[i] %= n;
        }
        return nums;
    }
    public static void main(String args[]) {
        int []nums={0,2,1,5,3,4};
        int n=nums.length;
        int []pri=build_array_permutation(nums);
        int []kum=buildArray(nums);
        for(int i=0;i<n;i++){
            System.out.print(pri[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(kum[i]+" ");
        }
    }
}
