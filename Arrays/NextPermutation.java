package Arrays;

public class NextPermutation {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int arr[], int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void next_permutation(int arr[]) {
        int index = -1;
        int n = arr.length;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            reverse(arr, 0, n - 1);
        } else {
            for (int i = n - 2; i >= index; i++) {
                if (arr[i] > arr[index]) {
                    swap(arr, i, index);
                    break;
                }
            }
            reverse(arr, index + 1, n - 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        next_permutation(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
