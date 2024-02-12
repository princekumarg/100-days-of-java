package Searching;

public class SpecialArray {
    public static int maxval(int arr[], int val) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= val) {
                count++;
            }
        }
        return count;
    }

    public static int specialArray(int arr[]) {
        int start = 0, end = 1000;
        int mid = (start + end) / 2;
        while (start <= end) {
            int ans = maxval(arr, mid);
            if (ans == mid) {
                return ans;
            }
            if (ans > mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5 };
        System.out.println(specialArray(arr));
    }
}
