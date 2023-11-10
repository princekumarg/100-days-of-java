package Mathmatics;

import java.util.*;

public class primfactorization {
    public static void Prime_factorization(int n) {
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            // While i divides n, print i and divide n
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if (n > 2) {
            System.out.print(n);
        }
    }

    public static List<Integer> divisore(int n) {
        List<Integer> ls = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                ls.add(i);
                if (n / i != i) {
                    ls.add(n / i);
                }
            }
        }
        return ls;
    }

    public static List<Integer> primeFactor(int n) {
        List<Integer> ls = new ArrayList<>();
        while (n % 2 == 0) {
            ls.add(2);
            n = n / 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i = i + 2) {
            while (n % i == 0) {
                ls.add(i);
                n = n / i;
            }
        }
        if (n > 2) {
            ls.add(n);
        }
        return ls;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Prime_factorization(n);
        System.out.println();
        System.out.println(divisore(n));
        System.out.println(primeFactor(n));
    }
}
