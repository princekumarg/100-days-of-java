package Searching;
import java.util.*;
public class count_the_element {
    public static int MaximumOcurring(int []arr,int n) {
        int res=0,count=1;
        for(int i=1;i<n;i++){
            if(arr[res]==arr[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                res=i;
                count=1;
            }
        }
        count=0;
        for(int i=0;i<n;i++){
            if(arr[res]==arr[i]){
                count++;
            }
        }
        if(count<=n/2){
            res=-1;
        }
        return res;
    }
    public static void main(String args[]) {
        int []arr={2,1,2,4,3,2,2};
        int n=arr.length;
        System.out.println(MaximumOcurring(arr, n));
    }
}
