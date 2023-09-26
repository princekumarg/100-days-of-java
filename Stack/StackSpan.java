package Stack;

import java.util.*;

/*[18,12,13,14,11,16]==span array [1,1,2,3,1,6] at 16 
span is 6 beacuse it is geateer than all element.*/
public class StackSpan {
    public static void calculateSpan(int price[], int n, int S[]) {
        S[0] = 1;
        for (int i = 1; i < n; i++) {
            S[i] = 1;
            for (int j = i - 1; (j >= 0) && (price[i] >= price[j]); j--)
                S[i]++;
        }
    }

    public static void calculateSpan1(int price[], int n, int S[]) {
        Stack<Integer> st = new Stack<>();
        st.push(0);

        S[0] = 1;
        for (int i = 1; i < n; i++) {
            while (!st.empty() && price[st.peek()] <= price[i])
                st.pop();

            S[i] = (st.empty()) ? (i + 1) : (i - st.peek());
            st.push(i);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 18, 12, 13, 14, 11, 16 };
        int n = arr.length;
        int S[] = new int[n];
        calculateSpan(arr, n, S);
        System.out.println(Arrays.toString(S));
        calculateSpan1(arr, n, S);
        System.out.println(Arrays.toString(S));
    }
}
