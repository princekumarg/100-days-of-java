package DP;

import java.util.Arrays;

public class frongjumpk {
    public static int frogjump(int n, int k, int height[]) {
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        int mm = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    int jump = dp[i - j] + Math.abs(height[i] - height[i - j]);
                    mm = Math.min(jump, mm);
                }
            }
            dp[i] = mm;
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        int height[] = { 10, 30, 40, 20 };
        int n = height.length;
        int k = 2;
        System.out.println(frogjump(n, k, height));
    }
}
