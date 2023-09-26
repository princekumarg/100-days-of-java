package queue;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Purchasing_Max_item {
    public static int getmaxPurchsing(int arr[], int sum) {
        int count = 0;
        int curr_sum = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (curr_sum + arr[i] <= sum) {
                curr_sum += arr[i];
                count++;
            }
        }
        return count;
    }

    public static int getmaxPurchsing1(int arr[], int sum) {
        Queue<Integer> pq = new PriorityQueue<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        while (!pq.isEmpty()) {
            if (pq.peek() <= sum) {
                sum -= pq.poll();
                count++;
            } else {
                break;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 12, 5, 111, 200 };
        // int arr[] = { 20, 10, 5, 30, 100 };
        int sum = 10;
        // int sum = 35;
        System.out.println(getmaxPurchsing(arr, sum));
        System.out.println(getmaxPurchsing1(arr, sum));
    }
}
