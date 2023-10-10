package Searching;

public class shipcapacity {
    public static int capicity(int arr[], int limit) {
        int n = arr.length, load = 0, day = 1;
        for (int i = 0; i < n; i++) {
            if (load + arr[i] > limit) {
                day = day + 1;
                load = arr[i];
            } else {
                load += arr[i];
            }
        }
        return day;
    }

    public static int leastweight(int arr[], int day) {
        int n = arr.length;
        int sum = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            max = Math.max(max, arr[i]);
        }
        int start = max, end = sum;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (capicity(arr, mid) <= day) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 5, 2, 3, 4, 5, 6 };
        int limit = 5;
        System.out.println(leastweight(arr, limit));
    }
}
