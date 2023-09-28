package Arrays;

public class MaxStock {
    public static int maxstock(int arr[], int n) {
        int profit = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                profit = profit + (arr[i] - arr[i - 1]);
            }
        }
        return profit;
    }

    public static int maxstock1(int arr[], int n) {
        int max = arr[0], min = arr[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        for (int i = 0; i < n; i++) {
            min = Math.min(min, arr[i]);
        }
        return max - min;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6 };
        int n = arr.length;
        System.out.println(maxstock(arr, n));
        System.out.println(maxstock1(arr, n));
    }
}
