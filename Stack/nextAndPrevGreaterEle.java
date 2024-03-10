package Stack;

import java.util.Stack;

public class nextAndPrevGreaterEle {
    public static void printprev(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int j;
            for (j = i - 1; j >= 0; j++) {
                if (arr[j] > arr[i]) {
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
            if (j == -1) {
                System.out.print(-1 + " ");
            }
        }
    }

    public static void printprev1(int arr[], int n) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(arr[0]);
        System.out.print("-1, ");
        for (int i = 1; i < n; i++) {
            while (s.isEmpty() == false && s.peek() <= arr[i]) {
                s.pop();
            }
            int prevgre = (s.isEmpty()) ? -1 : s.peek();
            System.out.println(prevgre);
            s.push(arr[i]);
        }
    }

    public static void printnext(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int j;
            for (j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    System.out.println(arr[i] + " ");
                    break;
                }
            }
            if (j == n) {
                System.out.println(-1 + " ");
            }
        }
    }

    public static void printnext1(int arr[], int n) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(arr[n - 1]);
        System.out.print("-1, ");
        for (int i = n - 2; i >= 0; i--) {
            while (s.isEmpty() == false && s.peek() <= arr[i]) {
                s.pop();
            }
            int nextgre = (s.isEmpty()) ? -1 : s.peek();
            System.out.println(nextgre);
            s.push(arr[i]);
        }
    }

    public static int[] nextLargerElement(int[] arr, int n) {
        // Your code here
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (st.size() > 0 && arr[i] >= st.peek()) {
                st.pop();
            }
            ans[i] = st.empty() ? -1 : st.peek();
            st.push(arr[i]); // we push value that is only Greater Smaller value gets Pop() by while Loop
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 100, 80, 60, 70, 60, 75 };
        int n = arr.length;
        printprev(arr, n);
        nextLargerElement(arr, n);
        printprev1(arr, n);
        printnext(arr, n);
        printnext1(arr, n);

    }

}
