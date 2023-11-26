package Mathmatics;

import java.util.*;

public class prime_no {
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 && n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return true;
            }
        }
        return true;
    }

    public static String countFactore(int n) {
        if ((n & 1) == 1) {
            return "odd";
        } else {
            if (n % 4 == 0) {
                return "even";
            } else {
                return "same";
            }
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        System.out.println(isPrime(n));
        System.out.println(countFactore(n));
    }
}
