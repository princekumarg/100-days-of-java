package Mathmatics;

import java.util.*;

public class power {
    public static int powers(int x, int n) {
        int res = 1;
        for (int i = 0; i < n; i++) {
            res = res * x;
        }
        return res;
    }

    public static int powers1(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int temp = powers1(x, n / 2);
        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return temp * temp * x;
        }
    }

    public static double myPow(double x, int n) {// leetcode
        double ans = 1.0;
        long nn = n;
        if (nn < 0) {
            nn = -1 * nn;
        }
        while (nn > 0) {
            if (nn % 2 == 1) {// (4^5)=(4*4^4) odd
                ans = ans * x;
                nn = nn - 1;
            } else {// (2^10)=(4^5)=((2*2)^5
                x = x * x;
                nn = nn / 2;
            }
        }
        if (n < 0) {
            ans = (double) (1.0) / (double) (ans);
        }
        return ans;
    }

    public static int powerofthree(int n) {
        while (n >= 3) {
            if (n % 2 != 0) {
                return 0;
            }
            n = n / 3;
        }
        return n == 1 ? 1 : 0;
    }

    public static long poweress(int x, int n) {
        if (n == 0) {
            return 0;
        }
        long temp = poweress(x, n / 2);
        if (n % 2 == 0) {
            return (long) (temp * temp) % 1000000007;
        } else {
            return (long) (temp * temp * x) % 1000000007;
        }
    }

    public static int goodno(int n) {
        int mod = 1000000007;
        int odd = (n + 1) / 2;
        int even = n / 2;
        return (int) (poweress(5, even) * poweress(4, odd)) % mod;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        System.out.println(powers(x, n));
        System.out.println(powers1(x, n));
        System.out.println(myPow(x, n));
        System.out.println(poweress(x, n));
        System.out.println(goodno(n));
    }
}
