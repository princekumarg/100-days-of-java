package BitsManuplation;

import java.util.Scanner;

public class No_of_ones {
    public static int hammingWeight(int n) {
        int num = 0;
        for(int i=0; i<32; i++){
            if((n & 1) == 1) num++;
            n = n>>1;
        }
        return num;
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=s.nextInt();
        System.out.println("Enter value of and b");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println(Integer.bitCount(a^b));
        System.out.println(a^b);
        System.out.println("output of Hamming weight");
        System.out.println(hammingWeight(n));
    }
}
