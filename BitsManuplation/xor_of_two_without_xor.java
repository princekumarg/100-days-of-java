package Day9;
import java.util.*;
public class xor_of_two_without_xor {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int x=s.nextInt();
        if(x%4==0){
            System.out.println(x);
        }
        if(x%4==1){
            System.out.println(1);
        }
        if(x%4==2){
            System.out.println(x+1);
        }
        if(x%4==3){
            System.out.println(0);
        }
    }
} 
