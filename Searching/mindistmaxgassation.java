package Searching;

public class mindistmaxgassation {
    public static int gasstation(double dist, int arr[]) {
        int n = arr.length;
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            int numberdiff = (int) ((arr[i] - arr[i - 1]) / dist);
            if ((arr[i] - arr[i - 1]) == numberdiff * dist) {
                numberdiff--;
            }
            cnt += numberdiff;
        }
        return cnt;
    }

    public static double minimaxdistance(int arr[], int n, int k) {
        double low = 0;
        double high = 0;
        for (int i = 0; i < n - 1; i++) {
            high = Math.max(high, arr[i + 1] - arr[i]);
        }
        double diff = 1e-6;
        while (low - high > diff) {
            double mid = (low + high) / 2;
            if (gasstation(mid, arr) > k) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = arr.length;
        int k = 4;
        System.out.println(minimaxdistance(arr, n, k));
    }
}
