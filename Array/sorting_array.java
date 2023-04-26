package Array;
import java.util.*;
public class sorting_array {
    public static void main(String args[]) {
        int []arr=new int[]{1,4,2,3,6,12,11,15};
        System.out.println("Sorting or not");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int tmp=0;
                if(arr[i]>arr[j]){
                    tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;                
                }
            }
            System.out.println(arr[i]);
        }
    }
}
