package Recursion;
import java.util.*;
public class Tower_of_hanoie {
    public static void TOH(int n,char a,char b,char c) {
        if(n==1){
            System.out.println("Move 1 From "+ a +" to "+ c);
            return;
        }
        else{
            TOH(n-1, a, c, b);
            System.out.println("Move "+ n +" From "+ a +" to "+ c);
            TOH(n-1, b, a, c);
        }
    }
    public static void main(String args[]) {
        int n = 2; // Number of disks
        TOH(n, 'A', 'C', 'B');
    }
}
