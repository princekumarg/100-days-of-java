package Arrays;

import java.util.Arrays;

public class FirstMissingPostive {
    public static int firstpostive(int arr[]) {
        Arrays.sort(arr);
        int ans = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ans) {
                ans++;
            }
        }
        return ans;
    }

    public static int firstpostive2(int arr[]) {
        int n = arr.length;
        int ans[] = new int[n + 1];
        for (int nums : arr) {
            if (nums > 0 && nums <= n) {
                ans[nums] = 1;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (ans[i] == 0) {
                return i;
            }
        }
        return n + 1;
    }

    public static int missing(int arr[], int size) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = arr.length + 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int x = Math.abs(arr[i]);
            if (x <= arr.length && arr[x - 1] > 0) {
                arr[x - 1] = arr[x - 1];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                return i + 1;
            }
        }
        return arr.length + 1;
    }

    public static int segregate(int[] arr) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        return i;
    }

    public static int findMissing(int[] arr) {
        int shift = segregate(arr);
        int[] arr2 = Arrays.copyOfRange(arr, shift, arr.length);
        return findMissingPostive(arr2);
    }

    public static int findMissingPostive(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            while (arr[i] > 0 && arr[i] <= size && arr[arr[i] - 1] != arr[i]) {
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return size + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 10, 2, -10, -20 };
        System.out.println(firstpostive(arr));
        System.out.println(findMissing(arr));
        System.out.println(firstpostive2(arr));
    }
}
