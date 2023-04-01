package Day1;
import java.util.*;
public class swap_num {
    public static void main(String args[]){
        int a=5,b=10;
        System.out.println("1st number before swap=" +a);
        System.out.println("2nd number before swap=" +b);
        int sw=a;
        a=b;
        b=sw;
        System.out.println("1st number after swap=" +a);
        System.out.println("2nd number after swap=" +b);
    }

}
