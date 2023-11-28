package Functions;

public class gcdsum {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int gcd3No(int a, int b, int c) {
        return gcd(gcd(a, b), c);
    }

    public static int gcdsuming(int k) {
        int sum = 0;
        for (int a = 1; a <= k; a++) {
            for (int b = 1; b <= k; b++) {
                for (int c = 1; c <= k; c++) {
                    sum = sum + gcd3No(a, b, c);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int k = 200;
        System.out.println(gcdsuming(k));
    }
}
