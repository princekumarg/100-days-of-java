package Leetcode;
import java.util.*;
public class MultipleOfThreeAndFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long a = 0, b = 0, d = 0;
            a = (n - 1) / 3;
            b = (n - 1) / 5;
            d = (n - 1) / 15;
            long sum3 = 3 * a * (a + 1) / 2;
            long sum5 = 5 * b * (b + 1) / 2;
            long sum15 = 15 * d * (d + 1) / 2;
            long c = sum3 + sum5 - sum15;
            System.out.println(c);
        }
    }
}
