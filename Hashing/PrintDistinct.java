package Hashing;

import java.util.HashMap;
import java.util.Map;

public class PrintDistinct {
    public static void printdistict(int arr[], int n, int k) {
        for (int i = 0; i < n - k; i++) {
            int count = 0;
            for (int j = 0; j < k; j++) {
                boolean flag = false;
                for (int p = 0; p < j; p++) {
                    if (arr[i + j] == arr[i + p]) {
                        flag = true;
                        break;
                    }
                }
                if (flag == false) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    public static void printdistict1(int arr[], int n, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();

    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 10, 10, 30, 40 };
        int n = arr.length;
        int k = 4;
        printdistict(arr, n, k);
    }
}
