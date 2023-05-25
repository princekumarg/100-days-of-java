package Leetcode;
import java.util.*;
public class evenFibbionacci {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            if (n < 2)
            System.out.print(0);
        // Initialize first two even Fibonacci numbers
        // and their sum
        long ef1 = 0, ef2 = 2;
        long sum = ef1 + ef2;
     
        // calculating sum of even Fibonacci value
        while (ef2 <= n)
        {
            // get next even value of Fibonacci sequence
            long ef3 = 4 * ef2 + ef1;
     
            // If we go beyond limit, we break loop
            if (ef3 > n)
                break;
     
            // Move to next even number and update sum
            ef1 = ef2;
            ef2 = ef3;
            sum += ef2;
        }
     
        System.out.println((int)sum);
        }
    }
}
