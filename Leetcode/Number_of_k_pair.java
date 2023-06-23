package Leetcode;

import java.util.Arrays;

public class Number_of_k_pair {
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int i = 0;
        int j = nums.length - 1;
        while(i<j) {
            if(nums[i] + nums[j] > k) {
                j--;
            } else if(nums[i] + nums[j] < k) {
                i++;
            } else {
                count++;
                i++;
                j--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int []nums={1,2,3,4};
        int k=5;
        System.out.println(maxOperations(nums,k));
    }
}
