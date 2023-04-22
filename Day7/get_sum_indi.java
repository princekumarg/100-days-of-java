package Day7;
import java.util.*;
public class get_sum_indi {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(get_num(n));
    }
    public static int get_num(int n) {
        if(n<=9){
            return n;
        }
        else{
            return get_num(n/10)+n%10;
        }
    }
}
