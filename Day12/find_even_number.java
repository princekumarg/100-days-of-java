package Day12;
import java.util.*;
public class find_even_number {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                System.out.println("Even element in array is="+arr[i]);
            }
        }
    }
}
