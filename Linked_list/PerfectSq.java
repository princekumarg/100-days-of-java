package Linked_list;

public class PerfectSq {
    public static int numSquares(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            if (n == 1 && n == 3) {
                count = n;
            } else if (n % (i * i) == 0) {
                sum = sum + (i * i);
                count++;
            }
        }
        return count;
    }

    public static int numSquares1(int n) {
        while (n % 4 == 0)
            n /= 4;
        if (n % 8 == 7)
            return 4;
        for (int x = 0; x * x <= n; x++) {
            int y = (int) Math.sqrt(n - x * x);
            if (x * x + y * y == n) {
                if (x == 0 || y == 0)
                    return 1;
                else
                    return 2;
            }
        }
        return 3;
    }
}
