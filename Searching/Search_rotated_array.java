package Searching;
import java.util.*;
public class Search_rotated_array {
    public static int Searching_in_rotated(int []arr,int x) {
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(mid==x){
                return mid;
            }
            if(arr[start]<arr[mid]){//left most sorted
                if(x>=arr[start] && x<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{// right most shorted
                if(x>arr[mid] && x<=arr[end]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int []arr={10,20,40,60,5,8};
        System.out.println(Searching_in_rotated(arr, 60));
    }
}
