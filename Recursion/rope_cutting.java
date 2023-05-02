package Recursion;
import java.util.*;
public class rope_cutting {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        System.out.println(rope_cut(n, a, b, c));
    }
    public static int max(int a,int b,int c) {
        if(a>b){
            if(a>c){
                return a;
            }
            else{
                return c;
            }
        }
        else{
            if(b>c){
                return b;
            }
            else{
                return c;
            }
        }
    }
    public static int rope_cut(int n,int a,int b,int c) {
        if(n==0){
            return 0;
        }
        if(n<0){
            return -1;
        }
        int res=max(rope_cut(n-a, a, b, c),rope_cut(n-b, a, b, c),rope_cut(n-c, a, b, c));
        if(res==-1){
            return -1;
        }
        return res+1;
    }
}
