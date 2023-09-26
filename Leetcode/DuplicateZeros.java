package Leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class DuplicateZeros {
    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j >= i + 1; j--) {
                    arr[j] = arr[j - 1];
                }
                i = i + 1;
            }
        }
    }

    public static void duplicateZeros1(int[] arr) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            q.add(arr[i]);
            if (arr[i] == 0) {
                q.add(0);
            }
            arr[i] = q.remove();
        }
    }

    public static void duplicateZeros2(int[] arr) {
        if (arr.length == 1) {
            return;
        }
        int st = 0, end = arr.length - 1;
        while (st < end) {
            if (st < end) {
                if (arr[st] == 0) {
                    end--;
                }
                st++;
            }
        }
        if (end == arr.length - 1)
            return;
        for (int i = arr.length - 1; i >= 0 && end >= 0; i--, end--) {
            arr[i] = arr[end];
            if (end != st && arr[end] == 0) {
                arr[i - 1] = 0;
                i = i - 1;
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicateZeros(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        duplicateZeros1(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        duplicateZeros2(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
