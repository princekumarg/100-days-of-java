package Loop;
import java.util.Scanner;
public class Power_by_add {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("Enter a number");
        int n1=0,n2=1,pow;
        for(int i=0;i<=n;i++){
            n1=n2;
            pow=n1+n2;
            n2=pow;
            System.out.println(pow);
        }
    }
}
