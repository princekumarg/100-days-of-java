package Leetcode;

public class ArrangingCoins {
    public static int arrangeCoins(int n) {
        long left = 1;
        long right = n;
        while (left <= right) {
            long mid = (left + right) / 2;
            long sum = mid * (mid + 1) / 2;
            if (sum == n) {
                return (int) mid;
            } else if (sum > n) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return (int) right;
    }

    public static int arrangeCoins1(int n) {
        int ans = 1;
        while (n > 0) {
            ans++;
            n = n - ans;
        }
        return ans - 1;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
        System.out.println(arrangeCoins1(5));
    }
}
