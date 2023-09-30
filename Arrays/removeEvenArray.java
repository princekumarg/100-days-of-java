package Arrays;

public class removeEvenArray {
    public static int removeeven(int arr[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                arr[count++] = arr[i];
            }
        }
        return count;
    }

    public static int removeodd(int arr[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                arr[count++] = arr[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = arr.length;
        n = removeeven(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        n = removeodd(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "");
        }
    }
}
