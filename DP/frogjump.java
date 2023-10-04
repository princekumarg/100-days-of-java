package DP;

public class frogjump {
    public static int frogjumper(int n, int arr[]) {
        int prev = 0;
        int prev2 = 0;
        int right = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            int left = prev + Math.abs(arr[i] - arr[i - 1]);
            if (i > 1) {
                right = prev2 + Math.abs(arr[i] - arr[i - 2]);
            }
            int curr = Math.min(left, right);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 30, 40, 20 };
        int n = arr.length;
        System.out.println(frogjumper(n, arr));
    }

}
