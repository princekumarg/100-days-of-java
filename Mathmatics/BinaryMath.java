package Mathmatics;

import java.util.ArrayList;

public class BinaryMath {
    public static String BinaryStr(int n) {
        String s = Integer.toBinaryString(n);// use to convert decimal to binary
        return s;
    }

    public static void reverse(char arr[], int start, int end) {
        while (start <= end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static ArrayList<Integer> rotate(int N, int D) {
        String s = Integer.toBinaryString(N);
        ArrayList<Integer> ans = new ArrayList<>();
        char arr[] = s.toCharArray();
        int n = arr.length;
        D = D % 2;
        reverse(arr, 0, n - 1);
        reverse(arr, D, n - 1);
        reverse(arr, 0, n - 1);
        String temp = String.valueOf(arr);
        ans.add(Integer.parseInt(temp, 2));
        return ans;
    }

    public static void main(String[] args) {
        int n = 28;
        int d = 2;
        System.out.println(rotate(n, d));
        System.out.println(BinaryStr(n));
    }
}
