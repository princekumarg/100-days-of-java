package Day7;
import java.util.*;
public class One_to_n {
    public static void printN(int n) {
        if(n==0){
            return ;
        }
        System.out.println(n);
        printN(n-1);
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        printN(n);
    }
}
