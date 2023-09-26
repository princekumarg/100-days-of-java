package BST;

import java.util.*;

public class ceilingleft {
    public static void printceiling(int arr[], int n) {
        System.out.println(-1);
        for (int i = 1; i < n; i++) {
            int diff = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (arr[j] >= arr[i]) {
                    diff = Math.min(diff, arr[j] - arr[i]);
                }
            }
            if (diff == Integer.MAX_VALUE) {
                System.out.println(-1);
            } else {
                System.out.println(arr[i] + diff);
            }
        }
    }

    public static void printceiling1(int arr[], int n) {
        System.out.println(-1);
        TreeSet<Integer> s = new TreeSet<>();
        s.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (s.ceiling(arr[i]) != null) {
                System.out.println(s.ceiling(arr[i]));
            } else {
                System.out.println(-1);
            }
            s.add(arr[i]);
        }
    }

    public static void rightceil(int arr[], int n) {
        System.out.println(-1);
        TreeSet<Integer> s = new TreeSet<>();
        s.add(arr[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            if (s.ceiling(arr[i]) != null) {
                System.out.println(s.ceiling(arr[i]));
            } else {
                System.out.println(-1);
            }
            s.add(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 8, 30, 15, 25, 12 };
        int n = arr.length;
        printceiling(arr, n);
        System.out.println("using left tresset");
        printceiling1(arr, n);
        System.out.println("using right treeset");
        rightceil(arr, n);
    }
}
