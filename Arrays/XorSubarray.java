package Arrays;

import java.util.HashMap;
import java.util.Map;

public class XorSubarray {
    public static int xorarray(int arr[], int k) {
        int n = arr.length;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int xor = 0;
            for (int j = i; j < n; j++) {
                xor = xor ^ arr[j];
                if (xor == k) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static int xorarray2(int arr[], int k) {
        int n = arr.length;
        Map<Integer, Integer> mp = new HashMap<>();
        int cnt = 0;
        int xor = 0;
        mp.put(xor, 1);
        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
            int x = xor ^ k;
            if (mp.containsKey(x)) {
                cnt += mp.get(x);
            }
            if (mp.containsKey(xor)) {
                mp.put(xor, mp.get(xor) + 1);
            } else {
                mp.put(xor, 1);
            }

        }
        return cnt;

    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 2, 6, 4 };
        int k = 6;
        System.out.println(xorarray(arr, k));
        System.out.println(xorarray2(arr, k));
    }
}
