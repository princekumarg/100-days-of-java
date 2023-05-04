package Day9;
import java.util.*;
public class power_of_2 {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        if((n&(n-1))==0){
            System.out.println("Yes power of 2");
        }
        else{
            System.out.println("Not power of 2");
        }
    }
}
