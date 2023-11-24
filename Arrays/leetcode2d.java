package Arrays;

public class leetcode2d {
    public static int account(int arr[][]) {
        int ans = Integer.MIN_VALUE;
        for (int x[] : arr) {
            int sum = 0;
            for (int y : x) {
                sum += y;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(account(arr));
    }
}
