package Array;
import java.util.*;
public class array_operation {
    public static int search(int arr[],int x,int n) {
        for(int i=0;i<n;i++){
            if(arr[i]==x){//serching in array
                return i;
            }
        }
        return -1;
    }
    public static int insert(int arr[],int n,int x,int cap,int pos) {
        if(n==cap){
            return n;
        }
        int idx=pos-1;
        for(int i=n-1;i>=idx;i--){
            arr[i+1]=arr[i];
        }
        arr[idx]=x;
        return (n+1);
    }
    public static int deleteArr(int arr[],int n,int x) {
        int i;
        for(i=0;i<n;i++){
            if(arr[i]==x){
                break;
            }
        }
        if(i==n){
            return n;
        }
        for(int j=i;j<n-1;j++){
            arr[j]=arr[j+1];
        }
        return (n-1);
    }
    public static void main(String args[]) {
        int arr[]={2,3,4,5,6};
        System.out.println(search(arr, 6, 5));
        System.out.println(insert(arr, 5, 7,5, 3));
        System.out.println(deleteArr(arr, 5, 3));
    }
}
