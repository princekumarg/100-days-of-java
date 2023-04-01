package Day5;
import java.util.*;
public class factorial {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();
        int a=1;
        for(int i=1;i<=n;i++){
            a=a*i;
        }
        System.out.println("Fact is="+a);
    }
}
