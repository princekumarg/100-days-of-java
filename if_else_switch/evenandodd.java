package if_else_switch;
import java.util.*;
public class evenandodd {
    public static void main(String args[]){
        Scanner r=new Scanner(System.in);
        System.out.print("Enter a number=");
        int n=r.nextInt();
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
}