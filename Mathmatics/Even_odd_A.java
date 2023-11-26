package Mathmatics;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Even_odd_A {

    public static int countpair(int arr[]) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static int nc2(int n) {
        return (n * (n - 1)) / 2;
    }

    public static int countpair1(int arr[]) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int val1 = arr[i];
            mp.put(val1, mp.getOrDefault(val1, 0) + 1);
        }
        int total = nc2(arr.length);
        int invalid = 0;
        for (int val : mp.values()) {
            invalid += nc2(mp.get(val));
        }
        return total - invalid;

    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 1, 1, 4, 9, 9, 6, 8, 2, 4, 1, 1, 9, 5, 5, 5, 3, 6, 4 };
        // int arr[] = { 1, 2, 1 };
        System.out.println(countpair(arr));
        System.out.println(countpair1(arr));
    }
}
