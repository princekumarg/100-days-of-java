package Day5;
import java.util.*;
public class least_common_divisior {
    public static int lcm(int a,int b) {
        int res=Math.max(a,b);
        while(true){
            if(res%a==0 && res%b==0){
                break;
            }
            res++;
        }
        return res;
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println(lcm(a,b));
    }
}
