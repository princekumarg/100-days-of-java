package Day9;
import java.util.*;
public class xor_L_and_R {
    public static int find_xor(int n) {
        int mod=n%4;
        if(mod==0){
            return n;
        }
        else if(mod==1){
            return 1;
        }
        else if(mod==2){
            return n+1;
        }
        else if(mod==3){
            return 0;
        }
        return n;
    }
    public static int find_xors(int L,int R) {
        return (find_xor(L-1)^find_xor(R));
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int L=s.nextInt();
        int R=s.nextInt();
        System.out.println(find_xors(L, R));
    }
}
