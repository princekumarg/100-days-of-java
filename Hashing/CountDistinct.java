package Hashing;

import java.util.Arrays;
import java.util.HashSet;

//[10,10,20,20,10]==[10,20] which count is 2;
public class CountDistinct {
    public static int countdist(int arr[], int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                res++;
            }
        }
        return res;
    }

    public static int countdist1(int arr[], int n) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(arr[i]);
        }
        return hs.size();
    }

    public static int countdist2(Integer arr1[]) {
        HashSet<Integer> hs = new HashSet<>(Arrays.asList(arr1));
        return hs.size();
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 10, 20, 10 };
        int n = arr.length;
        Integer[] arr1 = { 10, 10, 20, 20, 10 };
        System.out.println(countdist(arr, n));
        System.out.println(countdist1(arr, n));
        System.out.println(countdist2(arr1));
    }
}
