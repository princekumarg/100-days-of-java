package Leetcode;

public class LongestOnes {
    public static int longestOnes(int[] nums, int k) {
        int j = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == 0)
                k--;
            if (k < 0) {
                if (nums[j] == 0) {
                    k++;
                }
                j++;
            }
            i++;
        }
        return i - j;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1 };
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }
}
