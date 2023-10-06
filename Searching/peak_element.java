package Searching;

import java.util.*;

public class peak_element {
    public static int peak(int[] arr, int n) {
        if (n == 1) {
            return 1;
        }
        if (arr[0] > arr[1]) {
            return 0;
        }
        if (arr[n - 1] > arr[n - 2]) {
            return n - 1;
        }
        int start = 1, end = n - 2;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] > arr[mid - 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int peak1(int[] arr, int n) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 5, 10, 1 };
        int n = arr.length - 1;
        System.out.println(peak(arr, n));
        System.out.println(peak1(arr, n));
    }
}
