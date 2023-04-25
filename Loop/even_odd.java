package Loop;
import java.util.*;
public class even_odd {
    public static void main(String agrs[]) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number=");
        int n=s.nextInt();
        System.out.println("even number");
        for(int i=0;i<=n;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("odd number");
        for(int j=0;j<=n;j++){
            if(j%2!=0){
                System.out.print(j+" ");
            }
        }
    }
}
