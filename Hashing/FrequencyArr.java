package Hashing;

import java.util.HashMap;
import java.util.Map;

//[10,10,20,10,20,30,10]==count is 10=4,20=2,30=1;
public class FrequencyArr {
    public static void printFreq(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == true) {
                continue;
            }
            int freq = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                }
            }
            System.out.println(arr[i] + ":" + freq);
        }
    }

    public static void printFreq1(int arr[], int n) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int x : arr) {
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public static int[] printmaxmin(int arr[], int n) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int x : arr) {
            if (mp.containsKey(x)) {
                mp.put(x, mp.get(x) + 1);
            } else {
                mp.put(x, 1);
            }
        }
        int max = 0, min = 0;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
            if (entry.getValue() < min) {
                min = entry.getValue();
            }
        }
        int res[] = new int[2];
        res[0] = max;
        res[1] = min;
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 10, 10, 20, 30, 10 };
        int n = arr.length;
        printFreq(arr, n);
        printFreq1(arr, n);
        int res[] = printmaxmin(arr, n);
        System.out.print(res[0] + " " + res[1]);
    }
}
