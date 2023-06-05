package Leetcode;

public class good_array {
    public static boolean isGoodArray(int[] nums) {
        int ans = nums[0];
        for (int num : nums) {
            ans = gcd(ans, num);
        }
        return ans == 1;
    }
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    public static void main(String args[]) {
        int nums[]={12,5,7,23};
        System.out.println(isGoodArray(nums));
    }
}
