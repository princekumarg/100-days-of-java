package Recursion;

import java.util.*;

public class sum_n {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number=");
        int n = s.nextInt();
        System.out.println("The of " + n + " is=" + sum_n(n));
        System.out.println("The of " + n + " is=" + sum_n1(n, 0));
    }

    public static int sum_n(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sum_n(n - 1);
        }
    }

    public static int sum_n1(int n, int sum) {
        if (n < 1) {
            return sum;
        } else {
            return sum_n1(n - 1, sum + n);
        }
    }
}
