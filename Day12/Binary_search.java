package Day12;
import java.util.*;
public class Binary_search {
    public static int Binarysearch(int []arr,int x) {//iterative approach
        int start=0,end=arr.length-1;
        while(start<=end){
            int median=(start+end)/2;
            if(arr[median]==x){
                return median;
            }
            else if(arr[median]>x){
                end=median-1;
            }
            else{
                start=median+1;
            }
        }
        return -1;
    }
    public static int Binarysearch1(int []arr,int start,int end,int x) {
        int mid=(start+end)/2;
        if(arr[mid]==x){
            return mid;
        }
        else if(arr[mid]>x){
            return Binarysearch1(arr,start,mid-1,x);
        }
        else{
            return Binarysearch1(arr,mid+1,end,x);
        }
    }
    public static void main(String args[]) {
        int []arr={2,3,4,5,6,7};
        System.out.println(Binarysearch(arr,3));
        System.out.println(Binarysearch1(arr, 0, arr.length-1, 3));
    }
}
