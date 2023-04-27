package Array;
import java.util.*;
public class rotate_array_one {
    public static void rotateoneindex(int []arr,int n) {
        int temp=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
    public static void main(String args[]) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int d=2;
        rotateoneindex(arr,n);
        System.out.println(Arrays.toString(arr));
        rotate_n_times1(arr, d, n);
        System.out.println(Arrays.toString(arr));
        rotate_n_times2(arr, n, d);
        System.out.println(Arrays.toString(arr));
        rotate_n_times3(arr, n, d);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate_n_times1(int []arr,int n,int d) {
        for(int i=0;i<d;i++){
            rotateoneindex(arr,n);
        }
    }
    public static void rotate_n_times2(int []arr,int n,int d) {
        int temp[]=new int[n];
        int k=0;
        for(int i=0;i<d;i++){
            temp[k]=arr[i];
            k++;
        }
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
            k++;
        }
        for(int i=0;i<d;i++){
            arr[n-d+i]=temp[i];
        }
    }
    public static void revrse(int []arr,int low,int high) {
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
    public static void rotate_n_times3(int []arr,int n,int d) {
        revrse(arr,0,d-1);
        revrse(arr, d, n-1);
        revrse(arr, 0, n-1);
    }
}
