package TypeConversion;
import java.util.*;
public class Datatype_conversion {
    public static void main(String args[]) {
        // Integer to String to String integer
        int i=200;  
        String s=String.valueOf(i);  
        System.out.println(i+100); 
        System.out.println(s+100);
        String r=Integer.toString(i);  
        System.out.println(i+100);
        System.out.println(r+100);
        String t=String.format("%d",i);  
        System.out.println(t+100); 
        // String to long
        String u="9990449935";  
        long l=Long.parseLong(u);  
        System.out.println(l);
        // Long to String
        long j=9993939399L;  
        String v=String.valueOf(j);  
        System.out.println(v); 
        float f=Float.parseFloat("23.6");  
        System.out.println(f);  
        float g=12.3F;
        String w=String.valueOf(g);  
        System.out.println(w);
        double d=Double.parseDouble("23.6");  
        System.out.println(d);   
        double D=12.3;  
        String S=String.valueOf(D);  
        System.out.println(S);      
    }
}
