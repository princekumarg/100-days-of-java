package Searching;

public class smallestdivisor {
    public static int divisor(int arr[], int div) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.ceil((double) (arr[i]) / (double) (div));
        }
        return sum;
    }

    public static int smallestdiv(int arr[], int limit) {
        int n = arr.length;
        if (n > limit)
            return -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        int start = 1, end = max;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (divisor(arr, mid) <= limit) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 9 };
        int limit = 6;
        System.out.println(smallestdiv(arr, limit));
    }
}
