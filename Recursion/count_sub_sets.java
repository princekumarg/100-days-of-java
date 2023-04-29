package Day7;
import java.util.*;
public class count_sub_sets {
    public static int countsubsets(int arr[],int n,int sum,int s,int count) {
        if(n==0){
            if(sum==s){
                count++;
            }
            return count;
        }
        count=countsubsets(arr, n-1, sum, s, count);
        count=countsubsets(arr, n-1 , sum, s+arr[n-1] , count);
        return count;
    }
    public static void main(String args[]) {
        int arr[]={1,2,3,4,5};
        int sum=10;
        int s=0;
        int n=arr.length;
        System.out.println(countsubsets(arr, n, sum, s, 0));
    }
}
