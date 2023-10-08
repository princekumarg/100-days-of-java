package Arrays;

public class Learder {
    public static int[] leader(int arr[]) {
        int max = -1;
        int n = arr.length;
        int ans[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = max;
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 10, 4, 10, 6, 5, 2 };
        int ans[] = leader(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
