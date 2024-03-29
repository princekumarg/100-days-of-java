package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class subarraysum {
    public static boolean subarrsum(int arr[], int sum) {
        for (int i = 0; i < arr.length; i++) {
            int curr_sum = 0;
            for (int j = i; j < arr.length; j++) {
                curr_sum += arr[j];
                if (curr_sum == sum) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean issum(int arr[], int sum) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int pre_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            pre_sum += arr[i];
            if (pre_sum == sum) {
                return true;
            }
            if (hs.contains(pre_sum - sum)) {
                return true;
            }
            hs.add(pre_sum);
        }
        return false;
    }

    public static int summisk(int arr[], int k) {
        int sum = 0, result = 0;
        Map<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (hm.containsKey(sum - k)) {
                result = result + hm.get(sum - k);
            }
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 8, 6, 13, 3, -1 };
        int sum = 22;
        int k = 2;
        System.out.println(subarrsum(arr, sum));
        System.out.println(issum(arr, sum));
        System.out.println(summisk(arr, k));
    }
}
