package Array;
import java.util.*;
public class first_miss_postive {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int x=first_missnumber(arr);
        System.out.println(x);
    }
    public static int segregrate(int []arr) {
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]<0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        return ;
    }
    public static int first_missnumber(int []arr) {
        int start=segregrate(arr);
        int []arr1=new int[arr.length-start];
        int k=0;
        for(int i=start;i<arr.length;i++){
            arr1[k]=arr[i];
            k++;
        }
        for(int i=0;i<arr1.length;i++){
            int x=Math.abs(arr1[i]);
            if((x-1<arr1.length)&&(arr1[x-1]>0)){
                arr1[x-1]=-arr1[x-1];
            }
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>0){
                return i+1;
            }
        }
        return arr1.length+1;
    }
}
