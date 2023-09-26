package Hashing;

import java.util.HashMap;

public class LongestSumarr {
    public static int maxlen(int arr[], int sum) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr_sum = 0;
            for (int j = i; j < arr.length; j++) {
                curr_sum += arr[j];
                if (curr_sum == sum) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }
        return res;
    }

    public static int maxlen1(int arr[], int sum) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int pre_sum = 0, res = 0;
        for (int i = 0; i < arr.length; i++) {
            pre_sum += arr[i];
            if (pre_sum == sum) {
                res = i + 1;
            }
            if (hm.containsKey(pre_sum)) {
                hm.put(pre_sum, i);
            }
            if (hm.containsKey(pre_sum - sum)) {
                res = Math.max(res, i - hm.get(pre_sum - sum));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 1, 5, -6, 6, 2, 2 };
        int sum = 21;
        System.out.println(maxlen(arr, sum));
        System.out.println(maxlen1(arr, sum));
    }
}
