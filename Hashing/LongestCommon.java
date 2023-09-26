package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class LongestCommon {
    public static int maxCommon(int arr1[], int arr2[], int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            int sum1 = 0, sum2 = 0;
            for (int j = i; j < n; j++) {
                sum1 += arr1[j];
                sum2 += arr2[j];
                if (sum1 == sum2) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }
        return res;
    }

    public static int maxCommon1(int arr1[], int arr2[], int n) {
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr1[i] - arr2[i];
        }
        HashMap<Integer, Integer> m = new HashMap<>();
        int pre_sum = 0, res = 0;
        for (int i = 0; i < n; i++) {
            pre_sum += temp[i];
            if (pre_sum == 0) {
                res = i + 1;
            }
            if (m.containsKey(pre_sum)) {
                res = Math.max(res, i - m.get(pre_sum));
            } else {
                m.put(pre_sum, i);
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int arr1[] = { 0, 1, 0, 0, 0, 0 };
        int arr2[] = { 1, 0, 1, 0, 0, 1 };
        int n = arr1.length;
        System.out.println(maxCommon(arr1, arr2, n));
        System.out.println(maxCommon1(arr1, arr2, n));
    }
}
