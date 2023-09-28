package Arrays;

public class missingindex {
    public static int missindex(int arr[], int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total = total + arr[i];
        }
        int diff = ((n) * (n + 1)) / 2;
        return diff - total;
    }

    public static int missindex2(int arr[], int n) {
        int x1 = arr[0];
        int x2 = 1;
        for (int i = 1; i < n; i++) {
            x1 = x1 ^ arr[i];
        }
        for (int i = 2; i < (n + 1); i++) {
            x2 = x2 ^ i;
        }
        return x1 ^ x2;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 2, 3, 4, 5, 6 };
        int n = arr.length;
        System.out.println(missindex(arr, n));
        System.out.println(missindex2(arr, n));
    }
}
