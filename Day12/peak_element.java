package Day12;
import java.util.*;
public class peak_element {
    public static int peak(int []arr,int n) {
        if(n==1){
            return arr[0];
        }
        if(arr[0]>=arr[1]){
            return arr[0];
        }
        if(arr[n-1]>=arr[n-2]){
            return arr[n-1];
        }
        for(int i=1;i<n-1;i++){
            if(arr[i]>=arr[i-1]&&arr[i]<=arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }
    public static int peak1(int []arr,int n) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    public static void main(String args[]) {
        int arr[]={2,3,4,5,10,1};
        int n=arr.length-1;
        System.out.println(peak(arr,n));
        System.out.println(peak1(arr,n));
    }
}
