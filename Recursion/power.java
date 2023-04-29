package Day7;
import java.util.*;
public class power {
    public static void  main(String args[]) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("Power is="+pow(a,b));
    }
    public static int pow(int a,int b) {
        if(b==0){
            return 1;
        }
        /*else{
            return a*pow(a,b-1);//in o(n)
        }*/ 
        else{
            int t=pow(a,b/2);//it will give o(n/2) time complexity;
            return t*a;
        }
    }
}
