package Leetcode;
import java.util.*;
public class findTheArrayzero {
    public static int[] sumZero(int n) {
        int[] v = new int[n];
        for(int i=0;i<n;i++)
            v[i]= 2*i - n + 1;
        return v;
    }
    public static void main(String[] args){
        int[] output = sumZero(7);
        for(int i=0;i<7;i++)
          System.out.print(output[i]+" ");
    }
}
