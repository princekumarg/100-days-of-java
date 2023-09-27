package Arrays;

import java.util.*;

public class SortedArray {
    public static int sort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; i < n; i++) {
                if (arr[i] > arr[j]) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static int sort1(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return 0;
            }
        }
        return 1;
    }

    public static int sort3(int arr[], int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[(i + 1) % arr.length]) {
                count++;
            }
            if (count > 1) {
                return 0;
            }
        }
        return 1;
    }

    public static void sortmain(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = 0;
                if (arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void sortmain1(int arr[], int n) {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        System.out.println(sort(arr, n));
        System.out.println(sort1(arr, n));
        System.out.println(sort3(arr, n));
        sortmain(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sortmain1(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
