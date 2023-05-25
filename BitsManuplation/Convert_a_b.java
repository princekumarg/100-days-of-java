package BitsManuplation;
import java.util.*;
public class Convert_a_b {
    public static int countSetBits(int n) {
        Scanner s=new Scanner(System.in);
        int count = 0;
        while (n != 0) {
            count++;
            n &= (n - 1);
        }
        return count;
    }
    public static int FlippedCount(int a, int b){
        return countSetBits(a ^ b);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Emter the number");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println(FlippedCount(a,b));
    }
}
