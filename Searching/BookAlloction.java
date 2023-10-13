package Searching;

public class BookAlloction {
    public static int allocation(int arr[], int pages) {
        int n = arr.length;
        int student = 1;
        int pagesstudent = 0;
        for (int i = 0; i < n; i++) {
            if (pagesstudent + arr[i] <= pages) {
                pagesstudent = pagesstudent + arr[i];
            } else {
                student++;
                pagesstudent = arr[i];
            }
        }
        return student;
    }

    public static int allocationbook(int arr[], int n, int m) {// m is bookallocation
        if (m > n) // index
            return -1;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            max = Math.max(max, arr[i]);
        }
        int start = max;
        int end = sum;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (allocation(arr, mid) > m) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int arr[] = { 25, 46, 28, 49, 24 };
        int n = 5;
        int m = 4;
        System.out.println(allocationbook(arr, n, m));
    }
}
