package Arrays;

import java.util.ArrayList;

public class countinversion {
    public static int countinversionset(int arr[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; i < n; i++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int Merge(int arr[], int low, int mid, int high) {
        ArrayList<Integer> ls = new ArrayList<>();
        int count = 0;
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                ls.add(arr[left]);
                left++;
            } else {
                ls.add(arr[right]);
                count += (mid - left + 1);
                right++;
            }
        }
        if (left <= mid) {
            ls.add(arr[left]);
            left++;
        }
        if (right <= high) {
            ls.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = ls.get(i - low);
        }
        return count;
    }

    public static int MergeSorting(int arr[], int low, int high) {
        int count = 0;
        if (low >= high) {
            return count;
        }
        int mid = (low + high) / 2;
        count += MergeSorting(arr, low, mid);
        count += MergeSorting(arr, mid + 1, high);
        count += Merge(arr, low, mid, high);
        return count;
    }

    public static int countinversionset1(int arr[], int n) {
        return MergeSorting(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 3, 5 };
        int n = arr.length;
        System.out.println(countinversionset(arr, n));
        System.out.println(countinversionset1(arr, n));
    }
}
