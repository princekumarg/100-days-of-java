package Leetcode;
import java.util.*;
public class square {
    public static int[] sortedSquares(int[] nums) {
        int x[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            x[i]=nums[i]*nums[i]; 
        }
        Arrays.sort(x);
        return x;
    }
    public static int[] sortedSquares1(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int index = n - 1;
        int l = 0, r = n - 1;
        while (l <= r) {
            if (Math.abs(nums[l]) < Math.abs(nums[r])) {
                res[index--] = nums[r] * nums[r];
                r--;
            } else {
                res[index--] = nums[l] * nums[l];
                l++;
            }
        }
        return res;
    }
    public static int[] sortedSquares3(int[] nums) {
        int n = nums.length;
        int small = 0;
        for (int i = 0; i < n; i++) {
            if (Math.abs(nums[i]) < Math.abs(nums[small])) {
                small = i;
            }
        }
        int[] res = new int[n];
        int index = 0;
        int l = small, r = small + 1;
        while (l >= 0 || r < n) {
            if (l < 0 || r < n && Math.abs(nums[l]) > Math.abs(nums[r])) {
                res[index++] = nums[r] * nums[r];
                r++;
            } else {
                res[index++] = nums[l] * nums[l];
                l--;
            }
        }
        return res;
    }
    public static void main(String args[]) {
        int nums[]={-4,-1,0,3,10};
        for(int i=0;i<nums.length;i++){
            System.out.println(sortedSquares(nums));
        }
    }
}
