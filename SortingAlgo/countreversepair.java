package Arrays;

import java.util.ArrayList;

public class countreversepair {
    public static int countreverse(int arr[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j] * 2) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void Merge(int arr[], int low, int mid, int high) {
        ArrayList<Integer> ls = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                ls.add(arr[left]);
                left++;
            } else {
                ls.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            ls.add(arr[left]);
            left++;
        }
        while (right <= high) {
            ls.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = ls.get(i - low);
        }
    }

    public static int countpair(int arr[], int low, int mid, int high) {
        int right = mid + 1;
        int count = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high && arr[i] > 2 * arr[right]) {
                right++;
            }
            count += (right - (mid + 1));
        }
        return count;
    }

    public static int MergeSort(int arr[], int low, int high) {
        int count = 0;
        if (low >= high) {
            return count;
        }
        int mid = (low + high) / 2;
        count += MergeSort(arr, low, mid);
        count += MergeSort(arr, mid + 1, high);
        count += countpair(arr, low, mid, high);
        Merge(arr, low, mid, high);
        return count;
    }

    public static int team(int[] skills, int n) {
        return MergeSort(skills, 0, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, 2, 3, 1 };
        int n = arr.length;
        System.out.println(countreverse(arr, n));
        System.out.println(team(arr, n));
    }
}
