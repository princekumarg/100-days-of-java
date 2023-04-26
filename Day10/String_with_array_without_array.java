package Day10;
import java.util.*;
public class String_with_array_without_array {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        //string without array
        System.out.println("Enter string");
        String str1=s.nextLine();
        System.out.println(str1);
        System.out.println("Enter The number charcter in array");
        int n=s.nextInt();
        String []str=new String[n];
        //string with array
        for(int i=0;i<n;i++){
            str[i]=s.nextLine();
        }
        for(int i=0;i<n;i++){
            System.out.print(str[i]);
        }
    }
}
