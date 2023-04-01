package Day8;
import java.util.*;
public class missing_index {
    public static void main(String args[]) {
        int total=0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number");
        int n=s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            int a=s.nextInt();
            arr[i]=a;
        }
        for(int i=0;i<n;i++){
            total=total+arr[i];
        }
        int sum=(n+1)*(n+2)/2;
        System.out.println("The Missing is"+(sum-total));
    }
}
