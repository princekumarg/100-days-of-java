package Day3;
import java.util.*;
public class gcd_without_modulo {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number=");
        int a=s.nextInt();
        int b=s.nextInt();
        while(a==b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        System.out.println("The gcd is="+a);
    }
}
