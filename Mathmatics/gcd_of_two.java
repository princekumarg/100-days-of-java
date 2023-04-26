package Mathmatics;
import java.util.*;
public class gcd_of_two {
    public static int gcd(int a,int b) {
        int res=Math.min(a,b);
        while(res>0){
            if(a%res==0 && b%res==0){
                break;
            }
            res--;
        }
        return res;
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your numbers");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println(gcd(a,b));
    }
}
