package Day12;
import java.util.*;
public class median_of_two_array {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        int []arr1=new int[n];
        int []arr2=new int[n];
        int a1=arr1.length;
        int b1=arr2.length;
        int c1=a1 + b1;
        int[] arr3=new int[c1];
        int sum=0;
        System.out.println("Enter the elements for arr1");
        for(int i=0;i<n;i++){
            arr1[i]=s.nextInt();
        }
        System.out.println("Enter the elements for arr2");
        for(int i=0;i<n;i++){
            arr2[i]=s.nextInt();
        }
        for (int i=0; i<a1; i=i + 1) {
            arr3[i]=arr1[i];
        }
        for (int i=0;i<b1;i=i+1) {
            arr3[a1+i] = arr2[i];
        }
        for (int i=0; i<c1;i=i+1) {
            sum=sum+arr3[i];
            //System.out.print(arr3[i]);
        }
        long mid=sum/c1;
        System.out.println("Median="+mid);
        //System.out.println(sum);
    }
    
}
