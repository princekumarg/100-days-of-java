package BitsManuplation;

public class divisoreffecienty {
    public static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        boolean sign = dividend < 0 ^ divisor < 0;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int quotient = 0;
        while (dividend - divisor >= 0) {
            int curdivisor = divisor;
            int curquotient = 1;
            while (dividend - (curdivisor << 1) >= 0) {
                curdivisor = curdivisor << 1;
                curquotient = curquotient << 1;
            }
            quotient += curquotient;
            dividend -= curdivisor;
        }
        return sign ? -quotient : quotient;
    }

    public static int counttoggle(int A, int B) {
        int count = 0;
        int C = A ^ B;
        while (C != 0) {
            C = C & (C - 1);
            count++;
        }
        return count;
    }

    public static int counttoggle1(int A, int B) {
        int count = 0;
        int i = 0;
        while (i < 32) {
            int mask = 1 << i;
            int bit1 = A & mask;
            int bit2 = B & mask;
            if (bit1 != bit2) {
                count++;
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;
        System.out.println(divide(dividend, divisor));
        System.out.println(counttoggle(dividend, divisor));
        System.out.println(counttoggle1(dividend, divisor));
    }
}
