package BST;

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

    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;
        System.out.println(divide(dividend, divisor));
    }
}
