package Day10;
import java.util.*;
public class string_array {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String []str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=s.nextLine();
        }
        for(int i=0;i<n;i++){
            System.out.print(str[i]);
        }
    }
}
