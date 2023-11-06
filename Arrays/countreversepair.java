package Arrays;

public class countreversepair {
    public static int countreverse(int arr[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j] * 2) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, 2, 3, 1 };
        int n = arr.length;
        System.out.println(countreverse(arr, n));
    }
}
