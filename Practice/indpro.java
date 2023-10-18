package Practice;

import java.util.*;

public class indpro {
    public static int indprod(int n) {
        int pro = 1;
        while (n != 0) {
            int rem = n % 10;
            pro = pro * rem;
            n = n / 10;
        }
        return pro;
    }

    public static int countsame(int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if ((n + i) == (n ^ i)) {
                count++;
            }
        }
        return count;
    }

    public static int npr(int n, int r) {
        int fact = 1;
        for (int i = n; i >= (n - r + 1); i--) {
            fact = fact * i;
        }
        return fact;
    }

    public static int hcf(int a, int b) {
        return b == 0 ? a : hcf(b, a % b);
    }

    public static int bread(int a, int b) {
        return a * b / (hcf(a, b) * hcf(a, b));
    }

    public static int sqrtbtw(int a, int b) {
        int cnt = 0;
        int p = (int) Math.sqrt(a);
        int q = (int) Math.sqrt(b);
        for (int i = p; i <= q; i++) {
            int sq = i * i;
            if (sq >= a && sq <= b) {
                cnt++;
            }
        }
        return cnt;
    }

    public static int sqrtbtw2(int a, int b) {
        int res = ((int) Math.floor(Math.sqrt(b)) - (int) Math.ceil(Math.sqrt(a))) + 1;
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number");
        // int n = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();
        // System.out.println(indprod(n));
        // System.out.println(countsame(n));
        // System.out.println(npr(n, 4));
        // System.out.println(bread(a, b));
        System.out.println(sqrtbtw(a, b));
        // System.out.println(sqrtbtw2(a, b));
    }
}
