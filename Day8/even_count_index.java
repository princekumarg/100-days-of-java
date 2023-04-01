package Day8;
import java.util.*;
public class even_count_index {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number element in array");
        int n=s.nextInt();
        int []arr=new int[n];
        int count =0;
        for(int i=0;i<n;i++){
            int a=s.nextInt();
            arr[i]=a;
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                System.out.print("The even element array="+arr[i]+" ");
                System.out.println();
                count ++;
            }
        }
        System.out.println("count in array"+count);
        
    }
}
