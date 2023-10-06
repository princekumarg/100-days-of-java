package DP;

public class MaximumsumNon {
    public static int maxsum(int n, int arr[]) {
        int prev = arr[0];
        int prev2 = 0;
        for (int i = 1; i < n; i++) {
            int pick = arr[i];
            if (i > 1) {
                pick = pick + prev2;
            }
            int nonpick = prev;
            int curr = Math.max(pick, nonpick);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 10, 10, 100, 5, 6 };
        int n = arr.length;
        System.out.println(maxsum(n, arr));
    }
}
