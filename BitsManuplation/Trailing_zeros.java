package BitsManuplation;

import java.util.Scanner;

public class Trailing_zeros {
    public static int Trailing_zeroes(int n) {
        int count=0;
        while((n&1)==0 && n>0){
            count++;
            n=n>>1;
        }
        return count;
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(Trailing_zeroes(n));
    }
}
