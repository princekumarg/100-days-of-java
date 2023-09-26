package Array;

public class PythagrousTriplet {
    public static int triplet(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int x = arr[i] * arr[i];
                    int y = arr[j] * arr[j];
                    int z = arr[k] * arr[k];
                    if (x == y + z || y == x + z || z == x + y) {
                        return 1;
                    }

                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 6, 5 };
        int n = arr.length;
        System.out.println(triplet(arr, n));
    }

}
