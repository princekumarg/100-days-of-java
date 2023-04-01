package Day8;
import java.util.*;
public class Array {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number element in array");
        int n=s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            int a=s.nextInt();
            arr[i]=a;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
