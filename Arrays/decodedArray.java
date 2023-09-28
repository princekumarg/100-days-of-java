package Arrays;

public class decodedArray {
    public static int[] decodedArrays(int arr[], int n, int first) {
        int tem[] = new int[n + 1];
        tem[0] = first;
        for (int i = 0; i < n; i++) {
            tem[i + 1] = tem[i] ^ arr[i];
        }
        return tem;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int n = arr.length;
        int first = 1;
        int res[] = decodedArrays(arr, n, first);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
