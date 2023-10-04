package Searching;

import java.util.*;

public class Search_rotated_array {
    public static int Searching_in_rotated(int[] arr, int x) {
        int n = arr.length;
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[start] <= arr[mid]) {
                if (arr[start] <= x && x < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] < x && x <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static boolean search_duplicat(int arr[], int k) {
        int n = arr.length;
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == k) {
                return true;
            }
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
                continue;
            }
            if (arr[start] <= arr[mid]) {
                if (arr[start] <= k && k <= arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] <= k && k <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return false;
    }

    public static void main(String args[]) {
        int[] arr = { 10, 20, 40, 60, 5, 8 };
        System.out.println(Searching_in_rotated(arr, 60));
        System.out.println(search_duplicat(arr, 60));
    }
}
