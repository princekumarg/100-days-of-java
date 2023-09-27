package Arrays;

public class ArrayUsingPermutation {
    public static int[] permutation(int arr[]) {
        int temp[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[arr[i]];
        }
        return temp;

    }

    public static int[] permutation1(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] + n * (arr[arr[i]] % n);
        }
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / n;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 0 };
        int n = arr.length;
        int arr1[] = permutation(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr1[i] + " ");
        }
        int arr2[] = permutation1(arr, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr2[i] + " ");
        }
    }
}
