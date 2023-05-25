package Leetcode;
import java.util.*;
public class perfectnumber{
    public static boolean PerfectNum(int n) {
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(n==sum){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(PerfectNum(n));
    }

}