package operators_datatypes;
import java.util.*;
public class inputandoutput {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number=");
        int n=s.nextInt();
        int result=n*(n+1)/2;
        System.out.println("The sum of n number=" +result);
    }
}
