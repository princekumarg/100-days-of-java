package Array;
import java.util.*;
public class pick_elm_count {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number");
        int n=s.nextInt(),count=0;
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            int a=s.nextInt();
            arr[i]=a;
        }
        for(int i=0;i<n;i++){
            if(arr[i]==2){
                System.out.println("Index is"+i);
                count++;
            }
        }
        System.out.println("Count"+count);
    }
}
