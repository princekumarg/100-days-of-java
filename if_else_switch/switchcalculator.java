package if_else_switch;
import java.util.*;
public class switchcalculator {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("enter the operator");
        char op=s.next().charAt(0);
        System.out.print("enter the num1=");
        int a=s.nextInt();
        System.out.print("enter the num2=");
        int b=s.nextInt();
        switch(op){
              case '+':
                  System.out.println((a+b)+ " ");
                  break;
              case '-':
                  System.out.println((a-b)+ " ");
                  break;
              case '*':
                  System.out.println((a*b)+ " ");
                  break;
              case '/':
                  System.out.println((a/b)+ " ");
                  break;
              default:
                  System.out.println("not a valid operation");
                  break;
        }
    }
}
