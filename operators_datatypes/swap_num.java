import java.util.*;
public class Swap
{
    public static void main(String []args)
    {
        int a=5,b=10;
        System.out.println("first number"+a);
        System.out.println("second number"+b);
        int sw=a;
        a=b;
        b=sw;
        System.out.println("1st number after swap="+a);
        System.out.println("2nd number after swap="+b);
    }
}
