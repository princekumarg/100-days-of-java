package Day1;
import java.util.*;
public class Global {
    static double pi=3.14;
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number=");
        int radius=s.nextInt();
        double area=pi*radius*radius;
        double perimeter=2*pi*radius;
        //String.format("%.nf") use to pression value of decimal
        System.out.println(String.format("%.20f",area));//area
        System.out.println(String.format("%.5f",perimeter));//perimeter
    }
}
