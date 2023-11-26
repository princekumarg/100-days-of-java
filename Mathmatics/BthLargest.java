package Mathmatics;

import java.util.ArrayList;
import java.util.List;

public class BthLargest {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static int BthLargestarray(int a, int b, int k) {
        int num = gcd(a, b);
        List<Integer> ls = new ArrayList<>();
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                ls.add(i);
                if (i != num / i) {
                    ls.add(num / i);
                }
            }
        }
        ls.sort(null);
        if (ls.size() < k) {
            return -1;
        }
        return ls.get(ls.size() - k);

    }

    public static void main(String[] args) {
        int a = 100;
        int b = 50;
        int k = 4;
        System.out.println(BthLargestarray(a, b, k));

    }
}
