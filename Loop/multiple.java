package Day3;
import java.util.*;
public class multiple {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number=");
        int n=s.nextInt();
        System.out.println();
        System.out.print("Mulitple=");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
