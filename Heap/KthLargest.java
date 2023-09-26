package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargest {
    public static int kthlargest(int arr[], int n, int k) {
        MinHeap mh = new MinHeap(k);
        for (int i = 0; i < k; i++) {
            mh.insert(arr[i]);
        }
        for (int i = k; i < n; i++) {
            if (arr[i] > mh.arr[0]) {
                mh.arr[0] = arr[i];
                mh.minHeapfy(0);
            }
        }
        return mh.arr[0];
    }

    public static int kthlargest1(int arr[], int n, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        int i;
        for (i = 0; i < n; i++) {
            q.add(arr[i]);
            if (q.size() > k)
                q.remove(q.peek());
        }
        return q.peek();
    }

    public static int kthsmallest(int arr[], int n, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int i;
        for (i = 0; i < n; i++) {
            q.add(arr[i]);
            if (q.size() > k) {
                q.remove(q.peek());
            }
        }
        return q.peek();
    }

    public static void main(String[] args) {
        int arr[] = { 7, 10, 4, 3, 20, 15 };
        int n = arr.length;
        int k = 3;
        System.out.println(kthlargest(arr, n, k));
        System.out.println(kthlargest1(arr, n, k));
        System.out.println(kthsmallest(arr, n, k));
    }
}
