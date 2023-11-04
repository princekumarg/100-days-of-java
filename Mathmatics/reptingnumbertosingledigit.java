package Mathmatics;

public class reptingnumbertosingledigit {
    public static int rept(int n) {
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        if (sum < 10) {
            return sum;
        } else {
            return rept(sum);
        }
    }

    public static void main(String[] args) {
        int n = 453;
        System.out.println(rept(n));
    }
}
