package SortingAlgo;
import java.util.*;
public class kthsmallest {
    public static int smallestno(int []arr,int k) {
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static void Swap(int[] arr,int position1,int position2){
    int temp = arr[position1];
    arr[position1] = arr[position2];
    arr[position2] = temp;
    }
    public static int partition(int []arr, int low,int high){
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high- 1; j++){
        if (arr[j] <= pivot)
        {
            i++;
            Swap(arr, i, j);
        }
    }
    Swap(arr, i + 1, high);
    return (i + 1);
    }
    public static int smallestno1(int []arr,int k) {
        int l=0,r=arr.length-1;
        while(l<=r){
            int p=partition(arr, l,r); 
            if(p==k-1){
                return p;
            }
            else if(p<k-1){
                return p+1;
            }
            else{
                return p-1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int arr[]={2,3,7,6,5,4};
        System.out.println(smallestno(arr,1));
        System.out.println(smallestno1(arr, 2));
    }
}
