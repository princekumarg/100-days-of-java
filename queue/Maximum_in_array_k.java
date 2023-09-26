package queue;

import java.util.Deque;
import java.util.LinkedList;

//[10,8,5,12,15,7,6],k=3==[10,12,15,15,15]
public class Maximum_in_array_k {
    public static void printmaxk(int arr[], int n, int k) {
        for (int i = 0; i < n - k + 1; i++) {
            int mx = arr[i];
            for (int j = i + 1; j < i + k; j++) {
                mx = Math.max(arr[j], mx);
            }
            System.out.print(mx + " ");
        }

    }

    public static void printmaxk1(int arr[], int n, int k) {
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[dq.peek()] + " ");
            while (!dq.isEmpty() && dq.peek() <= i - k) {
                dq.removeFirst();
            }
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        System.out.print(arr[dq.peek()] + " ");
    }

    public static void main(String[] args) {
        int arr[] = { 10, 8, 5, 12, 15, 7, 6 };
        int n = arr.length;
        int k = 3;
        printmaxk(arr, n, k);
        System.out.println();
        printmaxk1(arr, n, k);
    }
}
