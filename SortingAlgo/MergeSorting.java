package SortingAlgo;

import java.util.*;

public class MergeSorting {
    public static void merge(int array[], int low, int mid, int high) {
        ArrayList<Integer> ls = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (array[left] <= array[right]) {
                ls.add(array[left]);
                left++;
            } else {
                ls.add(array[right]);
                right++;
            }
        }
        while (left <= mid) {
            ls.add(array[left]);
            left++;
        }
        while (right <= high) {
            ls.add(array[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            array[i] = ls.get(i - low);
        }

    }

    public void mergeSort(int array[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    public static void main(String args[]) {
        int[] array = { 6, 5, 12, 10, 9, 1 };
        MergeSorting ob = new MergeSorting();
        ob.mergeSort(array, 0, array.length - 1);
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(array));
    }
}
