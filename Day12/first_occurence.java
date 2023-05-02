package Day12;
import java.util.*;
public class first_occurence {
    public static int Firstoccurence(int []arr,int start,int end,int x) {
        if(start>end){
            return -1;
        }
        int mid=(start+end)/2;
        if(arr[mid]<x){
            return Firstoccurence(arr, mid+1, end, x);
        }
        else if(arr[mid]>x){
            return Firstoccurence(arr,start,mid-1,x);
        }
        else{
            if(mid==0 || arr[mid-1]!=arr[mid]){
                return mid;
            }
            else{
                return Firstoccurence(arr, start,mid-1, x);
            }
        }
    }
    public static int Firstoccurence1(int []arr,int x) {//iterative approach
        int start=0,end=arr.length-1;
        while(start<=end){
            int median=(start+end)/2;
            if(arr[median]<x){
                return start=median+1;
            }
            else if(arr[median]>x){
                return end=median-1;
            }
            else{
                if(median==0 || arr[median-1]!=arr[median]){
                    return median;
                }
                else{
                    return end=median-1;
                }
            }
        }
        return -1;
    }
    public static int Lastoccrance(int []arr,int x) {//iterative approach
        int start=0,end=arr.length-1;
        while(start<=end){
            int median=(start+end)/2;
            if(arr[median]<x){
                return start=median+1;
            }
            else if(arr[median]>x){
                return end=median-1;
            }
            else{
                if(median!=arr.length-1 || arr[median]!=arr[median+1]){
                    return median;
                }
                else{
                    return start=median+1;
                }
            }
        }
        return -1;
    }
    public static int Lastoccrance1(int []arr,int start,int end,int x) {
        if(start>end){
            return -1;
        }
        int mid=(start+end)/2;
        if(arr[mid]<x){
            return Lastoccrance1(arr, mid+1, end, x);
        }
        else if(arr[mid]>x){
            return Lastoccrance1(arr,start,mid-1,x);
        }
        else{
            if(mid!=arr.length-1 || arr[mid]!=arr[mid+1]){
                return mid;
            }
            else{
                return Lastoccrance1(arr,mid+1,end, x);
            }
        }
    }
    public static void main(String args[]) {
        int arr[]={10,10,10,20,20};
        System.out.println(Firstoccurence(arr, 0, arr.length-1, 10));
        System.out.println(Firstoccurence1(arr, 20));
        System.out.println(Lastoccrance(arr, 10));
        System.out.println(Lastoccrance1(arr, 0, arr.length-1, 10));
    }
}
