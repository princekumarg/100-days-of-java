package queue;

import java.util.PriorityQueue;

public class Sort_K_arr {
    public static void sort(int arr[], int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        int index = 0;
        for (int i = k + 1; i < n; i++) {
            arr[index++] = pq.poll();
            pq.add(arr[i]);
        }
        while (!pq.isEmpty()) {
            arr[index++] = pq.poll();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 6, 3, 12, 56, 8 };
        int k = 3;
        int n = arr.length;
        sort(arr, n, k);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
