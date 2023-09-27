package Arrays;

import java.util.*;

public class reverse {
    public static void reverse1(int arr[], int n) {
        int temp;
        for (int i = 0; i < n / 2; i++) {
            temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    public static void reverse2(int arr[], int n) {
        int temp[] = new int[n];
        for (int j = n - 1; j >= 0; j--) {
            temp[n - j - 1] = arr[j];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void revese3(int arr[], int n) {
        int i = 0, j = n - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        reverse1(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        reverse2(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        revese3(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        Collections.reverse(Arrays.asList(arr));// reverse using collection
    }
}
