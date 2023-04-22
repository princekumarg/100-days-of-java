package Day5;
import java.util.*;
public class power {
    public static int powers(int x,int n) {
        int res=1;
        for(int i=0;i<n;i++){
            res=res*x;
        }
        return res;
    }
    public static int powers1(int x,int n) {
        if(n==0){
            return 1;
        }
        int temp=powers1(x, n/2);
        if(n%2==0){
            return temp*temp;
        }
        else{
            return temp*temp*x;
        }
    }
    public static int powers2(int x,int n) {
        int res=1;
        while(n>0){
            if(n%2!=0){
                res=res*x;
            }
            x=x*x;
            n=n/2;
        }
        return res;
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();
        System.out.println(powers(x,n));
        System.out.println(powers1(x,n));
        System.out.println(powers2(x,n));
    }
}
