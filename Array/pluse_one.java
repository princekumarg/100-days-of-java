package Array;

import java.util.*;

public class pluse_one {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }

    public static ArrayList<Integer> increment(ArrayList<Integer> arr, int N) {
        // code here
        int carry = 1;
        for (int i = N - 1; i >= 0; i--) {
            int sum = arr.get(i) + carry;
            arr.set(i, sum % 10);
            carry = sum / 10;
        }
        if (carry != 0)
            arr.add(0, carry);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1 };
        int[] ans = plusOne(arr);
        System.out.println(Arrays.toString(ans));
        System.out.println();
    }
}
