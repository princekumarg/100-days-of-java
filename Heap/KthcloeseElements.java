package Heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class PairClass {
    Integer key;
    Integer value;

    public PairClass(Integer key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}

public class KthcloeseElements {
    public static void printclosest(int arr[], int n, int k, int x) {
        boolean visted[] = new boolean[n];
        Arrays.fill(visted, false);
        for (int i = 0; i < k; i++) {
            int min_diff = Integer.MAX_VALUE;
            int min_diff_id = -1;
            for (int j = 0; j < n; j++) {
                if (visted[j] == false && Math.abs(arr[j] - x) <= min_diff) {
                    min_diff = Math.abs(arr[j] - x);
                    min_diff_id = j;
                }
            }
            System.out.println(arr[min_diff_id] + " ");
            visted[min_diff_id] = true;
        }
    }

    public static void printclosest1(int arr[], int n, int k, int x) {
        PriorityQueue<PairClass> pq = new PriorityQueue<>(new Comparator<PairClass>() {
            public int compare(PairClass p1, PairClass p2) {
                return p2.getValue().compareTo(p1.getValue());
            }
        });
        for (int i = 0; i < k; i++) {
            pq.offer(new PairClass(arr[i], Math.abs(arr[i] - x)));
        }
        for (int i = k; i < n; i++) {
            int diff = Math.abs(arr[i] - x);
            if (diff > pq.peek().getValue())
                continue;
            pq.poll();
            pq.offer(new PairClass(arr[i], diff));
        }
        while (!pq.isEmpty()) {
            System.out.print(pq.poll().getKey() + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 100, 80, 10, 5, 70 };
        int n = arr.length;
        int x = 2, k = 3;
        printclosest(arr, n, k, x);
        printclosest1(arr, n, k, x);
    }
}
