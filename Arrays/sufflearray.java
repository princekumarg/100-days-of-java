package Arrays;

public class sufflearray {
    public static int[] shufflearray(int arr[], int n) {
        for (int i = n; i < 2 * n; i++) {
            arr[i] = arr[i] << 10;
            arr[i] |= arr[i - n];
        }
        int z = n;
        for (int i = 0; i < 2 * n; i++) {
            arr[i] = arr[z] & 1023;
            arr[i] = arr[z++] >> 10;
        }
        return arr;
    }

    public static int countarray(int arr[]) {
        int count[] = new int[101];
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += count[arr[i]]++;
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 3, 4, 7 };
        int n = arr.length / 2;
        arr = shufflearray(arr, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
