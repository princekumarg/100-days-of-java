package String;
import java.util.*;
public class leftmostArray {
    public static int leftmost(String str) {
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    return i;
                }
            }
        }
        return -1;
    }
    public static int leftmost1(String str) {
        int []count=new int[256];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i)]>1){
                return i;
            }
        }
        return -1;
    }
    public static int leftmost2(String str) {
        int []count=new int[256];
        Arrays.fill(count,-1);
        int res=Integer.MAX_VALUE;
        for(int i=0;i<str.length();i++){
            int fi=count[str.charAt(i)];
            if(fi==-1){
                count[str.charAt(i)]=i;
            }
            else{
                res=Math.min(res,fi);
            }
        }
        return (res==Integer.MAX_VALUE)?-1:res;
    }
    public static int leftmost3(String str) {
        boolean []visted=new boolean[256];
        int res=-1;
        for(int i=str.length()-1;i>=0;i--){
            if(visted[str.charAt(i)]){
                res=i;
            }
            else{
                visted[str.charAt(i)]=true;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String str="geeksforge";
        System.out.println(leftmost(str));
        System.out.println(leftmost1(str));
        System.out.println(leftmost2(str));
        System.out.println(leftmost3(str));
    }
}
