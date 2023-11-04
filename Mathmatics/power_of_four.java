package Mathmatics;

import java.util.*;

public class power_of_four {

    public static boolean fourpow1(int n) {
        return (n > 0) && ((n & (n - 1)) == 0) && ((n % 3) == 1);
    }

    public static boolean fourpow2(int n) {
        while (n >= 4) {
            if (n % 4 != 0) {
                return false;
            }
            n = n / 4;
        }
        return n == 1;
    }

    public static void main(String args[]) {
        int n = 60;
        // System.out.println(fourpow1(n));
        System.out.println(fourpow2(n));
    }
}
