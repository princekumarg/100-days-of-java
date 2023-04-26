package Array;
import java.util.*;
public class freq_elm_array {
    public static void freq_count(int []arr,int n) {
        boolean visited[]=new boolean[n];
        Arrays.fill(visited,false);
        for(int i=0;i<n;i++){
            if(visited[i]==true){
                continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i]+"="+count);
        }   
    }
    public static void main(String args[]) {
        int arr[]=new int[]{10,20,20,10,10,20,5,20};
        int n=arr.length;
        freq_count(arr,n);
    }
}
