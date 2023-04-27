package Array;
import java.util.*;
public class second_largest {
    public static int larget(int []arr) {
        int max=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    public static int  secondlargest1(int []arr) {
        int max=larget(arr);
        int res=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[max]){
                if(res==-1){
                    res=i;
                }
                else if(arr[i]>arr[res]){
                    res=i;
                }
            }
        }
        return res;
    }
    public static int secondlargest2(int []arr) {
        int res=-1,max=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[max]){
                res=max;
                max=i;
            }
            else if(arr[i]!=arr[max]){
                if(res==-1 || arr[i]>arr[res]){
                   res=i;
                }
            }
        }
        return res;
    }
    public static void main(String args[]) {
        int arr[]={5,2,4,6,1,3};
        System.out.println(secondlargest1(arr));
        System.out.println(secondlargest2(arr));
    }
}
