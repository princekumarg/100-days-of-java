package Leetcode;
import java.util.*;
public class MinimumSqrt{
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int sum=0;
    int count=0;
    for(int i=1;i<=n;i++){
        sum=sum+i*i;
    }
    for(int i=1;i<=n;i++){
        count=count+i;
    }
    int pro=(count*count)-sum;
    System.out.println(pro);
    }
}