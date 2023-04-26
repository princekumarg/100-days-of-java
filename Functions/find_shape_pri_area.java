package Functions;
import java.util.*;
public class find_shape_pri_area {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number=");
        double width=s.nextInt();
        double length=s.nextInt();
        double radius=s.nextInt();
        double a=s.nextInt();
        double b=s.nextInt();
        double c=s.nextInt();
        System.out.println(areaofRectangle(width,length));
        System.out.println(areaofcircle(radius));
        System.out.println(areaofTriangle(a,b,c));
    }
    public static double areaofRectangle(double width,double length){
        return width*length;
    }
    public static double areaofcircle(double radius) {
        return Math.PI*radius*radius;
    }
    public static double areaofTriangle(double a,double b,double c){
        double s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
