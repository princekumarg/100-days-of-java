package Searching;

import java.util.*;

public class first_Last_occurence_and_NoOccuranceOfNumber {

    public static int firstOccurance(int arr[], int n, int x) {
        int first = -1, last1 = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                if (first == -1) {
                    first = i;
                }
                last1 = i;
            }
        }
        return first;
    }

    public static int lower(int arr[], int n, int x) {
        int start = 0, end = n - 1;
        int mid = (start + end) / 2;
        int ans = n;
        while (start <= end) {
            if (arr[mid] >= x) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static int upper(int arr[], int n, int x) {
        int start = 0, end = n - 1;
        int mid = (start + end) / 2;
        int ans = n;
        while (start <= end) {
            if (arr[mid] > x) { // if(arr[mid]<=x) for upper bound
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static int[] firstAndLastPosition(int arr[], int n, int k) {
        int first = lower(arr, n, k);
        if (first == -1) {
            return new int[] { -1, -1 };
        }
        int last = upper(arr, n, first);
        return new int[] { first, last };
    }

    public static int count(int arr[], int n, int k) {
        int ans[] = firstAndLastPosition(arr, n, k);
        if (ans[0] == -1) {
            return 0;
        }
        return (ans[1] - ans[0] + 1);
    }

    public static int first(int arr[], int n, int x) {
        int first = lower(arr, n, x);
        if (first == n || arr[first] != x) {
            return -1;// if element is not present
        }
        return first;
    }

    public static int last(int arr[], int n, int x) {
        int last = upper(arr, n, x);
        if (last == n || arr[last - 1] != x) {
            return -1;// if element is not prsent
        }
        return last - 1;
    }

    public static void main(String args[]) {
        int arr[] = { 10, 10, 20, 20, 20, 30, 30 };
        int n = arr.length;
        // System.out.println(firstOccurance(arr, n, 30));
        System.out.println(Arrays.toString(firstAndLastPosition(arr, n, n)));
        // System.out.println(first(arr, n, 10));
        // System.out.println(last(arr, n, 10));
    }
}
