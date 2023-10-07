package Hashing;

import java.util.HashMap;
import java.util.Map;

public class sumkindex {
    public static int maxsumk(int arr[], int k) {
        int n = arr.length;
        Map<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int maxlen = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if (sum == k) {
                maxlen = Math.max(maxlen, i + 1);
            }
            int rem = sum - k;
            if (hm.containsKey(rem)) {
                int len = i - hm.get(rem);
                maxlen = Math.max(maxlen, len);
            }
            if (!hm.containsKey(sum)) {
                hm.put(sum, i);
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 2, 7, 1, 9 };
        int k = 15;
        System.out.println(maxsumk(arr, k));
    }
}
