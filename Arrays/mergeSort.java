package Arrays;

import java.util.Arrays;

public class mergeSort {
    public static void mergearray(int arr1[], int arr2[], int m, int n) {
        int right = 0;
        int left = m - 1;
        while (right < n && left >= 0) {
            if (arr1[left] > arr2[right]) {
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                right++;
                left--;
            } else {
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 3, 5, 7 };
        int arr2[] = { 0, 2, 6, 8, 9 };
        int m = arr1.length;
        int n = arr2.length;
        mergearray(arr1, arr2, m, n);
        for (int i = 0; i < m; i++) {
            System.out.println(arr1[i]);
        }
        mergearray(arr1, arr2, m, n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr2[i]);
        }
    }

}
