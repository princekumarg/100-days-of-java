package Hashing;

import java.util.HashMap;

public class LongestSubArray0or1 {
    public static int longestsub(int arr[], int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            int c0 = 0, c1 = 0;
            for (int j = i; j < n; j++) {
                if (arr[j] == 0) {
                    c0++;
                } else {
                    c1++;
                }
                if (c0 == c1) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }
        return res;
    }

    public static int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxlen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(count)) {
                maxlen = Math.max(maxlen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 1, 1, 1, 0, 0 };
        int n = arr.length;
        System.out.println(longestsub(arr, n));
        System.out.println(findMaxLength(arr));
    }
}
