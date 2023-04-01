package Day8;
import java.util.*;
public class inter_union {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        int []arr1=new int[n];
        int []arr2=new int[n];
        int []arr3=new int[n];
        System.out.println("Enter the elements for arr1");
        for(int i=0;i<n;i++){
            arr1[i]=s.nextInt();
        }

        System.out.println("Enter the elements for arr2");
        for(int i=0;i<n;i++){
            arr2[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                }
            }
        }
    }
}
