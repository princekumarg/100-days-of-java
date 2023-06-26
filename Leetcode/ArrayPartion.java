package Leetcode;

import java.util.Arrays;

public class ArrayPartion {
    public static int arrayPairSum(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2)
            ans += nums[i];
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(arrayPairSum(arr));
    }
}
