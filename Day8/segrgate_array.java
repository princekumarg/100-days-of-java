package Day8;
import java.util.*;
public class segrgate_array {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number element in array");
        int n=s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            int a=s.nextInt();
            arr[i]=a;
        }
        segrgate_arrays(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void segrgate_arrays(int[] arr) {
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]<0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
    }
}
