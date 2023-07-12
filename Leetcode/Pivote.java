package Leetcode;

public class Pivote {
    public static int pivotIndex(int[] nums) {
        int total_sums = 0;
        for (int i = 0; i < nums.length; i++) {
            total_sums = total_sums + nums[i];
        }
        int left_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((total_sums - left_sum) - nums[i] == left_sum) {
                return i;
            }
            left_sum = left_sum + nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 7, 3, 6, 5, 6 };
        System.out.println(pivotIndex(arr));
    }
}
