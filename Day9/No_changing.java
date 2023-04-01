package Day9;
import java.util.*;
public class No_changing {
    public static int countsetbits(int n) {
        int count=0;
        while(n>0){
            count+=n&1;
            n>>=1;
        }
        return count;
    }
    public static void main(String args[]){
        int i=9;
        System.out.println(countsetbits(i));
    }
}
