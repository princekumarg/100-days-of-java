package Day12;
import java.util.*;
public class reapting {
    public static void reapting(int []arr,int n) {
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String args[]) {//o(n*logn)
        int []arr={2,2,3,4,5,6};
        int n=arr.length;
        reapting(arr,n);
        reapting1(arr,n);
    }
    public static void reapting1(int []arr,int n){//o(n)
        boolean visited[]=new boolean[n];
        Arrays.fill(visited,false);
        for(int i=0;i<n;i++){
            if(visited[arr[i]]){
                System.out.println(arr[i]);
            }
            visited[arr[i]]=true;
        }

    }
}
