package Day5;
import java.util.*;
public class primfactorization {
    public static void Prime_factorization(int n) {
        while (n%2==0){
            System.out.print(2 + " ");
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            // While i divides n, print i and divide n
            while (n%i == 0)
            {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if (n > 2){
            System.out.print(n);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Prime_factorization(n);
    }
}
