package Searching;
import java.util.*;
public class sqrt {
    public static int sqrt(int n) {
        int i=1;
        while(i*i<=n){
            i++;
        }
        return i-1;
    }
    public static int sqrt1(int n) {//for timeexceed error put start datatypes as long
        int start=0,end=n,ans=-1;//for validation in boolean put boolean ans=false
        while(start<=end){
            int mid=(start+end)/2;
            int midsq=mid*mid;
            if(midsq==n){
                return mid;//return as true;
            }
            else if(midsq>n){
                end=mid-1;
            }
            else{
                start=mid+1;
                ans=mid;//in validation case remove the ans 
            }
        }
        return ans;
    }
    public static void main(String args[]) {
        int n=10;
        System.out.println(sqrt(n));
        System.out.println(sqrt1(n));
    }
}
