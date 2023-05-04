package Day9;

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
        int n=s.nextInt();
        System.out.println(hammingWeight(n));
    }
}
