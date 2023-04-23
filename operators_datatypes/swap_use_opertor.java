package operators_datatypes;
import java.util.*;
public class swap_use_opertor {
    public static void main(String agrs[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=s.nextInt();
        int b=s.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+" "+"b="+b);
    }
}
