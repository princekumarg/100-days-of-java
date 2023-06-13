package Array;
import java.util.*;
public class reverse_arr {
    public static void main(String args[]) {
        int i=0,j=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no element");
        int n=s.nextInt();
        int []arr=new int[n];
        for(i=0;i<n;i++){
            int a=s.nextInt();
            arr[i]=a;
        }
        j=i-1;
        i=0;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        revrse(arr,n);
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
        reverse(arr);
    }
    public static void revrse(int []arr,int n) {
        int low=0,high=n-1;
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
    public static void reverse(int a[]){
        int[] b = new int[a.length];
        int j = a.length;
        for (int i = 0; i < a.length; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        // printing the reversed array
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < a.length; k++) {
            System.out.println(b[k]);
        }
    }
}
