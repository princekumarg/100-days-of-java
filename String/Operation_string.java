package String;
import java.util.*;
public class Operation_string {
    public static void main(String args[]) {
        String str="princeKumaragrawal";
        String s1="prince";
        String s2="prince";
        String s=new String("Prince");
        System.out.println(str.charAt(3));
        System.out.println(str.length());
        String a=str.substring(1);
        String b=str.substring(1, 3);//Substring at begin=1 and ending=3
        System.out.println(str.substring(2));//Substring at index=2 as begin
        System.out.println(a);
        System.out.println(b);
        String c=" "+"kumar";
        System.out.println(str+c);//normal concat Function.
        String d=" ".concat("Agrawal");//concat function
        System.out.println(str+d);
        System.out.println(str==s);//equal without using buildInFunction
        System.out.println(str.equals(s));//equal using buildInFunction
        //check equal or not
        if(s1==s2){//without using object
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        String s3=new String("prince");//object comparision
        if(s1==s3){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println(str.contains(s2));//contain
    }
}
