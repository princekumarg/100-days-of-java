package DP;

public class Climbing_Stairs {
    public static int climbing_Stairs(int n) {
        int curr, prev1 = 1, prev2 = 1;
        for (int i = 1; i < n; i++) {
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

    public static int climbing_stairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; ++i)
            dp[i] = dp[i - 1] + dp[i - 2];
        return dp[n];
    }

    public static void main(String args[]) {
        int n = 3;
        System.out.println(climbing_Stairs(n));
        System.out.println(climbing_stairs(n));
    }
}
