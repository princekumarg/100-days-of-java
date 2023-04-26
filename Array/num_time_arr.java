package Array;
import java.util.*;
public class num_time_arr {
    public static void main(String args[]) {
        int arr[]={1,2,2,3,3,3};
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;i<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(arr[i]);
            }
            if(count==2){
                System.out.println(arr[i]);
            }
            if(count==3){
                System.out.println(arr[i]);
            }
        }
    }
}
