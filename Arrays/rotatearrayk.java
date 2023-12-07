package Arrays;

public class rotatearrayk {
    public static void reverse1(int arr[], int n) {
        int temp;
        for (int i = 0; i < n / 2; i++) {
            temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    public static void rotatedarray1(int arr[], int d) {
        for (int i = 0; i < d; i++) {
            int first = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = first;
        }
    }

    public static void rotatedonetimes(int arr[]) {
        int first = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
    }

    public static void reverse(int arr[], int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotated(int arr[], int k) {
        k = k % arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 2;
        rotatedarray1(arr, d);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        rotatedonetimes(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        rotated(arr, d);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
