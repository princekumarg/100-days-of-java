package BitsManuplation;

import java.util.Scanner;

//hamming weight
public class No_of_ones {
    public static int cnt1(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & 1) == 1)
                count++;
            n = n >> 1;
        }
        return count;
    }

    public static int totalsetbits(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += cnt1(i);
        }
        return count;
    }

    public static int cnt0(int n) {
        int count = 0;
        for (int i = 32; i >= 0; i--) {
            if ((n & 1) == 0) {
                count++;
            } else {
                break;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int Trailingzero(int n) {
        int cnt = 0;
        while ((n & 1) == 0 && n > 0) {
            cnt++;
            n = n >> 1;
        }
        return cnt;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = s.nextInt();
        System.out.println("Enter value of a and b");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(Integer.bitCount(a ^ b));
        System.out.println(a ^ b);
        System.out.println("output of Hamming weight");
        System.out.println(cnt1(n));
        System.out.println(Trailingzero(n));
        System.out.println(cnt0(n));
        System.out.println(totalsetbits(n));
    }
}
