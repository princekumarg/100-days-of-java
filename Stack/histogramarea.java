package Stack;

import java.util.Stack;

public class histogramarea {
    public static int getmaxarea(int arr[], int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] >= arr[i]) {
                    curr += arr[i];
                } else {
                    break;
                }
            }
            for (int j = i + 1; j < n; j++) {
                if (arr[j] >= arr[i]) {
                    curr += arr[i];
                } else {
                    break;
                }
            }
            res = Math.max(res, curr);
        }
        return res;
    }

    public static int getmaxarea1(int arr[], int n) {
        Stack<Integer> s = new Stack<>();
        int res = 0;
        for (int i = 0; i < n; i++) {
            while (s.isEmpty() == false && arr[s.peek()] >= arr[i]) {
                int tp = s.pop();
                int curr = arr[tp] * (s.isEmpty() ? i : (i - s.peek() - 1));
                res = Math.max(res, curr);
            }
            s.push(i);
        }
        while (s.isEmpty() == false) {
            int tp = s.pop();
            int curr = arr[tp] * (s.isEmpty() ? n : (n - s.peek() - 1));
            res = Math.max(res, curr);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 2, 5, 4, 1, 5, 6 };
        int n = arr.length;
        System.out.println(getmaxarea(arr, n));
        System.out.println(getmaxarea1(arr, n));
    }
}
