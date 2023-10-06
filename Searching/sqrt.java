package Searching;

import java.util.*;

public class sqrt {
    public static int sqrt(int n) {
        int i = 1;
        while (i * i <= n) {
            i++;
        }
        return i - 1;
    }

    public static int sqrt1(int n) {// for timeexceed error put start datatypes as long
        int start = 1, end = n;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid * mid <= n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }

    public static int sqrt2(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int start = 1, end = n;
        int mid = -1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (mid * mid == n) {
                return mid;
            }
            if (mid * mid < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return Math.round(mid);

    }

    public static int solve(int mid, int n, int m) {
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * mid;
            if (ans > m) {
                return 2;
            }
        }
        if (ans == m) {
            return 1;
        }
        return 0;

    }

    public static int sqrtatNth(int n, int m) {
        int start = 1, end = m;
        while (start <= end) {
            int mid = (start + end) / 2;
            int res = solve(mid, end, mid);
            if (res == 1) {
                return mid;
            }
            if (res == 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int n = 10;
        System.out.println(sqrt(n));
        System.out.println(sqrt1(n));
        System.out.println(sqrt2(n));
    }
}
