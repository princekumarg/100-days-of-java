package BitsManuplation;

import java.util.HashMap;
import java.util.Map;

public class XorArrayTwoSingle {
    public static int[] twooddNum(int arr[], int n) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
        int ans[] = new int[2];
        int k = 0;
        for (int x : mp.keySet()) {
            if (mp.get(x) % 2 != 0) {
                ans[k++] = x;
            }
        }
        return ans;
    }

    public static int[] twooddnum(int arr[], int n) {
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
        }
        int count = 0;
        while (true) {
            if ((xor & 1) == 1) {
                break;
            }
            count++;
            xor = xor >> 1;
        }
        int xor1 = 0, xor2 = 0;
        for (int i = 0; i < n; i++) {
            if ((arr[i] & (1 << count)) != 0) {
                xor1 = xor1 ^ arr[i];
            } else {
                xor2 = xor2 ^ arr[i];
            }
        }
        int ans[] = { Math.max(xor1, xor2), Math.min(xor1, xor2) };
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 3, 4, 8, 4, 4, 32, 7, 7 };
        int n = arr.length;
        int ans[] = twooddNum(arr, n);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
