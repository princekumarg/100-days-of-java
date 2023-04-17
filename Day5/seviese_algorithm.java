package Day5;
import java.util.*;
public class seviese_algorithm {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        seviese(n);
    }
    public static void seviese(int n) {
        int c = 2;
        while (n > 1) {
            if (n % c == 0) {
                System.out.print(c + " ");
                n /= c;
            }
            else
                c++;
        }
    }
}
