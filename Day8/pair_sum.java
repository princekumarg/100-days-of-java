package Day8;
import java.util.*;
public class pair_sum {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number=");
        int n=s.nextInt();
        System.out.print("Enter the value of sum=");
        int sum=s.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the value element:");
        for(int i=0;i<n;i++){
                int a=s.nextInt();
                arr[i]=a;
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println("array is="+arr[i]+" "+arr[j]);
                    System.out.println(" ");
                    System.out.println("index="+i+" "+j);
                    System.out.println(" ");
                }
            }
        }
    }
}
