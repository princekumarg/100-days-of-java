package Functions;
import java.util.*;
public class max_and_min {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number=");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int max=max(a,b,c);
        int min=min(a,b,c);
        System.out.printf("Maximum is %d,%d,and %d is=%d %n",a,b,c,max);
        System.out.printf("Minmum %d,%d,and %d is=%d %n",a,b,c,min);
    }
    public static int max(int a,int b,int c) {
        int temp=a;
        if(b>temp){
            temp=b;
        }
        if(c>temp){
            temp=c;
        }
        return temp;
    }
    public static int min(int a,int b,int c) {
        int count=a;
        if(b<count){
            count=b;
        }
        if(c<count){
            count=c;
        }
        return count;
    }
}
