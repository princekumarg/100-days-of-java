package SortingAlgo;
import java.util.*;
public class Sort_Array_By_Parity {
    public static int[] sortArrayByParityII(int[] nums) {
        int n =nums.length;
        int j=1;
         for (int i = 0; i < n; i += 2)
            if (nums[i] % 2 == 1) {
                while (nums[j] % 2 == 1)
                    j += 2;
               swap(nums, i, j);
                }
        return nums;
    }
    public static int[] sortArrayByParity(int[] nums) {
        int result[]; 
        int p = 0;
        result = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            if (nums[i] % 2 == 0){
                result[p] = nums[i];
                p++;
            } 
                
        for (int i = 0; i < nums.length; i++)
            if (nums[i] % 2 != 0){
                result[p] = nums[i];
                p++;
            } 
        return result;
    }
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int []nums={4,2,5,7};
        int []ans=sortArrayByParityII(nums); 
        System.out.println(Arrays.toString(ans));
        int []ans1=sortArrayByParity(nums);
        System.out.println(Arrays.toString(ans1));
    }
}
