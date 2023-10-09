package Searching;

public class boughtFlower {
    public static boolean flowerbought(int arr[], int day, int m, int k) {
        int count = 0;
        int bought = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day) {
                count++;
            } else {
                bought += count / k;
                count = 0;
            }
        }
        bought += count / k;
        return bought >= m;
    }

    public static int minday(int arr[], int m, int k) {
        long val = (long) m * k;
        int n = arr.length;
        if (val > n) {
            return -1;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        int start = min, end = max;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (flowerbought(arr, mid, m, k)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int m = 2;
        int k = 2;
        System.out.println(minday(arr, m, k));
    }
}
