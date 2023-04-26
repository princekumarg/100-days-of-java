package Mathmatics;
import java.util.*;
public class palindrom {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=s.nextInt();
        int original=n,rev=0;
        while(n!=0){
            int rem=n%10;
            n=n/10;
            rev=rev*10+rem;
        }
        if(original==rev){
            System.out.println("palindrom");
        }
        else{
        System.out.println("Not a Palindrom");
        }
    }
}
