package SortingAlgo;
import java.util.*;
public class radix_sort {
    public static int getMax(int arr[], int n) {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }
    public static void Radix_sort(int arr[],int n) {
        int m = getMax(arr, n);
        for (int exp = 1; m / exp > 0; exp *= 10)
            countsort(arr, n, exp);
    }
    public static void countsort(int arr[],int n,int exp) {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }
    public static void main(String args[]) {
        int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
        int n = arr.length;
        Radix_sort(arr, n);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
