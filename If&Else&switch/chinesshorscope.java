package Day2;
import java.util.*;
public class chinesshorscope {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("enter the year =");
        int year=s.nextInt();
        if(year%12==0)
            System.out.println("monkey"); 
        if(year%12==1)
            System.out.println("dog");
        if(year%12==2)
            System.out.println("pig");
        if(year%12==3)
            System.out.println("monkey");
        if(year%12==4)
            System.out.println("rat");
        if(year%12==5)
            System.out.println("ox");
        if(year%12==6)
            System.out.println("tiger");
        if(year%12==7)
            System.out.println("hare");
            if(year%12==8)
            System.out.println("dragon");
        if(year%12==9)
            System.out.println("snake");
        if(year%12==10)
            System.out.println("horse");
        if(year%12==11)
            System.out.println("sheep");
    }
}
