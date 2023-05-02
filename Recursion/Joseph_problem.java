package Recursion;
import java.util.*;
public class Joseph_problem {
    public static int Jos_pro(int n,int k) {
        if(n==1){
            return 0;
        }
        return (Jos_pro(n-1,k)+k)%n;
    }
    public static void main(String args[]) {
        System.out.println(Jos_pro(5, 3));
    }
}
