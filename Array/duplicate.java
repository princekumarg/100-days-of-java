package Array;

import java.util.*;

public class duplicate {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the index");
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            arr[i] = a;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("array=" + arr[i]);
                    System.out.println();
                    System.out.println("index=" + i + " " + j);
                    System.out.println();
                }
            }
        }
        System.out.println(duplicated(arr));
        System.out.println(kthindex(arr, 1, 3));
    }

    public static int duplicated(int arr[]) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            x = x ^ arr[i];
        }
        return x;
    }

    public static int kthindex(int arr[], int x, int N) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
            if (count == N) {
                count = i + 1;
            }
        }
        return count;
    }
}