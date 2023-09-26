package SortingAlgo;

public class CountConversion {
    public static int CountConversions(int[] arr, int n) {
        int res = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    res++;
                }
            }
        }
        return res;
    }

    public static int countandmerge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1, n2 = r - m;
        int right[] = new int[n1];
        int left[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[m + 1 + i];
        }
        int res = 0, i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
                res = res + (n1 - i);
            }
            k++;
        }
        while (i < n1) {
            arr[k] = left[i];
            i++;
            j++;
        }
        while (j < n2) {
            arr[k] = right[k];
            j++;
            k++;
        }
        return res;
    }

    public static int countInv(int arr[], int l, int r) {
        int res = 0;
        if (l < r) {
            int m = l + (r - l) / 2;
            res += countInv(arr, l, m);
            res += countInv(arr, m + 1, r);
            res += countandmerge(arr, l, m, r);
        }
        return res;
    }

    public static void main(String args[]) {
        int[] arr = { 5, 3, 4, 5, 2 };
        int n = arr.length;
        System.out.println(CountConversions(arr, n));
    }
}
