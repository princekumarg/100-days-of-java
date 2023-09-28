package Arrays;

import java.util.Arrays;

public class MathsArray {

    public static int[] sqsort(int arr[], int n) {
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i] * arr[i];
        }
        Arrays.sort(temp);
        return temp;
    }

    public static int gcdArray(int arr[], int n) {
        int res = arr[0];
        for (int i = 1; i < n; i++) {
            res = gcd(res, arr[i]);
        }
        return res;
    }

    public static int gcdArray1(int arr[], int n) {
        int a = 1, b = 1000;
        for (int x : arr) {
            a = Math.max(a, x);
            b = Math.min(b, x);
        }
        return gcd(a, b);
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 10, 20, 6, 3, 8 };
        int n = arr.length;
        int temp[] = sqsort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
        System.out.println(gcdArray(arr, n));
        System.out.println(gcdArray1(arr, n));
    }
}
