package GFG;

import java.util.ArrayList;
import java.util.LinkedList;

public class PerFectSum {
    public static int perfectSum(int arr[], int n, int sum) {
        // Your code goes here
        int s = 0;
        int i = 0, cnt[] = { 0 };
        LinkedList<Integer> temp = new LinkedList<Integer>();
        ss(arr, n, temp, sum, s, i, cnt);
        return cnt[0];

    }

    public static void ss(int arr[], int n, LinkedList<Integer> temp, int sum, int s, int i, int[] cnt) {
        if (s == sum) {
            cnt[0]++;
            return;
        }
        if (i == n || s > sum) {
            return;
        }
        temp.add(arr[i]);
        ss(arr, n, temp, sum, s + arr[i], i + 1, cnt);
        temp.removeLast();
        ss(arr, n, temp, sum, s, i + 1, cnt);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int sum = 10;
        System.out.println(perfectSum(arr, n, sum));

    }

}
