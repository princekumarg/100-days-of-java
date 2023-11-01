package Arrays;

import java.util.*;

public class duplicateElement {
    public static void duplicate(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

    public static boolean containduplicate(int arr[], int n) {
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void removeduplicate(int arr[], int n) {
        int x = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[x++] = arr[i];
            }

        }
        arr[x++] = arr[n - 1];
    }

    public static int removeduplicated(int arr[], int n) {
        int x = 0;
        for (int i = 0; i < n; i++) {
            x = x ^ arr[i];
        }
        return x;
    }

    public static int removeduplicate(int arr[]) {
        int j = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }

    public static int removeeven(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {// for some val arr[i]!=val
            if (arr[i] % 2 != 0) {
                arr[count++] = arr[i];
            }
        }
        return count;
    }

    public static int removeDuplicates(ArrayList<Integer> arr, int n) {
        // Write your code here.
        int i = 1;
        for (int j = 1; j < n; j++) {
            if (!arr.get(j).equals(arr.get(j - 1))) {
                arr.set(i++, arr.get(j));
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 1, 2, 3 };
        int n = arr.length;
        duplicate(arr, n);
        System.out.println();
        System.out.print(removeduplicated(arr, n));
        removeduplicate(arr, n);
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
        System.out.println(removeduplicate(arr));
        System.out.println(removeDuplicates(null, n));

    }
}
