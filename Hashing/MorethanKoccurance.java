package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MorethanKoccurance {
    public static void printNbyK(int arr[], int n, int k) {
        Arrays.sort(arr);
        int i = 1, count = 1;
        while (i < n) {
            while (i < n && arr[i] == arr[i - 1]) {
                count++;
                i++;
            }
            if (count > n / k) {
                System.out.println(arr[i - 1] + " ");
            }
            count = 1;
            i++;
        }
    }

    public static void printNbyK(int arr[], int k) {
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int x : arr) {
            m.put(x, m.getOrDefault(x, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> e : m.entrySet()) {
            if (e.getValue() > arr.length / k) {
                System.out.println(e.getKey() + " ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 10, 20, 30, 20, 10, 10 };
        int n = arr.length;
        int k = 2;
        printNbyK(arr, k);
        printNbyK(arr, n, k);
    }

}
