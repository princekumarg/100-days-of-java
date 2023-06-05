package SortingAlgo;
import java.util.*;
public class max_min_diff {
    public static int getmindiff(int arr[],int n) {
        int res=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                res=Math.min(res,Math.abs(arr[i]-arr[j]));
            }
        }
        return res;
    }
    public static int getmaxdiff1(int arr[],int n) {
        Arrays.sort(arr);
        int res=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            res=Math.min(res,arr[i]-arr[i-1]);
        }
        return res;
    }
    public static int findMinDiff(int[] arr, int n){
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (Math.abs((arr[i] - arr[j])) < diff)
                    diff = Math.abs((arr[i] - arr[j]));
        return diff;
    }
    public static void main(String args[]) {
        int arr[]={2,3,1,7,6};
        int n=arr.length;
        System.out.println(getmindiff(arr,n));
        System.out.println(getmaxdiff1(arr,n));
        System.out.println(findMinDiff(arr,n));
    }
}
