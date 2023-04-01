package Day8;
import java.util.*;
public class averge {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number element in array");
        int n=s.nextInt();
        int []arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            int a=s.nextInt();
            arr[i]=a;
        }
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        int averge=sum/n;
        System.out.println("sum is"+averge);
    }
}
