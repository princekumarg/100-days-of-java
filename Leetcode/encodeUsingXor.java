package Leetcode;
import java.util.*;
public class encodeUsingXor {
    public static int[] decode(int[] encoded, int first) {
        int size = encoded.length;
        int[] res = new int[size+1];
        res[0] = first;
        for(int i=0; i<size; i++) {
            res[i+1] = res[i] ^ encoded[i];
        }
        return res;
    }
    public static void main(String args[]) {
        int []encoded={1,2,3};
        int first=1;
        System.out.println(decode(encoded,first));

    }
}
