package Arrays;

import java.util.HashMap;
import java.util.Map;

public class sumofsubarr {
    public static int sumofsubarray(int arr[], int n, int k) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
                if (sum == k) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }
        return res;
    }

    public static int sumofsubarr1(int arr[], int n, int k) {
        long sum = 0;
        int maxlen = 0;
        Map<Long, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if (sum == k) {
                maxlen = Math.max(maxlen, i + 1);
            }
            long rem = sum - k;
            if (mp.containsKey(rem)) {
                int len = i - mp.get(rem);
                maxlen = Math.max(maxlen, len);
            }
            if (!mp.containsKey(sum)) {
                mp.put(sum, i);
            }
        }
        return maxlen;
    }

    public static int sumzero(int arr[], int n) {
        int sum = 0, maxi = 0;
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if (sum == 0) {
                maxi = Math.max(maxi, i + 1);
            }
            if (mp.containsKey(sum)) {
                int len = i - mp.get(sum);
                maxi = Math.max(maxi, len);
            }
            if (!mp.containsKey(sum)) {
                mp.put(sum, i);
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 2, 7, 1, 9 };
        int n = arr.length;
        int k = 15;
        System.out.println(sumofsubarray(arr, n, k));
        System.out.println(sumofsubarr1(arr, n, k));
        System.out.println(sumzero(arr, n));
    }
}
