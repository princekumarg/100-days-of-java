package Mathmatics;

public class countball {
    public static int countthenoball(int n, int b, int r) {
        int segment = n / (r + b);
        int valcount = segment * b + Math.min(n % (r + b), b);
        return valcount;
    }

    public static void main(String[] args) {
        int n = 8, b = 3, r = 4;
        System.out.println(countthenoball(n, b, r));
    }
}
