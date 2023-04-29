package Day7;
import java.util.*;
public class Gcd {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("Gcd="+gcd(a,b));
        System.out.println("Gcd_n="+gcd_n(a,b));
        System.out.println("lcm="+lcm(a,b));
    }   
    public static int gcd(int a,int b) {
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
    public static int gcd_n(int a,int b) {
        return b==0?a:gcd(b,a%b);
    }
    public static int lcm(int a,int b) {
        int l=gcd(a,b);
        return (a*b)/l;
    }
}
