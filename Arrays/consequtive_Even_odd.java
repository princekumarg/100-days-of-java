package Arrays;

public class consequtive_Even_odd {
    public static int evenodd(int arr[], int n) {
        int count = 1, res = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0 && arr[i - 1] % 2 != 0 || arr[i] % 2 != 0 && arr[i - 1] % 2 == 0) {
                count++;
                res = Math.max(res, count);
            } else {
                count = 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 10, 20, 6, 3, 8 };
        int n = arr.length;
        System.out.println(evenodd(arr, n));
    }
}
