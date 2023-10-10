package Searching;

public class Kthmissno {
    public static int kthmiss(int arr[], int k) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            int miss = arr[mid] - (mid + 1);
            if (miss < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end + 1 + k;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 7, 11 };
        int k = 5;
        System.out.println(kthmiss(arr, k));
    }
}
