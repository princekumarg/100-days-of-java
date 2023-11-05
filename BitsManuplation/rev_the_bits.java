package BitsManuplation;

import java.util.Scanner;

public class rev_the_bits {
    public static int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res = (res << 1) | (n & 1);
            n = n >> 1;
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        System.out.println(reverseBits(n));
    }
}
