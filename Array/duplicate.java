package Array;
import java.util.*;
public class duplicate {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the index");
        int n=s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            int a=s.nextInt();
            arr[i]=a;
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println("array="+arr[i]);
                    System.out.println();
                    System.out.println("index="+i+" "+j);
                    System.out.println();
                }
            }
        }
    }
}