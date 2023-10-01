package Arrays;

public class rotationArray {
    public static int[] rotationone(int arr[], int n) {
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
        return arr;
    }

    public static int[] rotationright(int arr[], int n) {
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int res[] = rotationone(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
        int res1[] = rotationright(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(res1[i] + " ");
        }
    }
}
