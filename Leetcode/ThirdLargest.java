package Leetcode;
import java.util.*;
public class ThirdLargest {
    public static int thirdMax(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int idx = n - 1 , i , distinctCount = 0;
        while(idx >= 0){
            distinctCount++;
            i = idx - 1;
            while(i >= 0 && nums[i] == nums[idx])
                i--;
            if(i == -1)
                return nums[n - 1];
            idx = i;
            if(distinctCount == 2)
                return nums[idx];
        }
        return -1;
    }
    public static void main(String args[]) {
        int nums[]={2,3,4,5,1};
        System.out.println(thirdMax(nums));
    }
}
