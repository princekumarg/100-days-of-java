package Arrays;

import java.util.*;

public class ArrayCreation {

    public static boolean search(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return true;
        }
        return false;
    }

    public static int kthindex(int arr[], int x, int k) {//
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
            if (count == k) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int x = 2;
        int k = 3;
        System.out.println(search(arr, x));
        System.out.println(kthindex(arr, x, k));

    }
}
