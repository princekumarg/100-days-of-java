package String;
import java.util.*;
public class NonReption {
    public static int NonRep(String str) {
        for(int i=0;i<str.length();i++){
            boolean flag=false;
            for(int j=0;j<str.length();j++){
                if(i!=j&&str.charAt(i)==str.charAt(j)){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                return i;
            }
        }
        return -1;
    }
    public static int NonRep1(String str) {
        int []count=new int[256];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i)]==1){
                return i;
            }
        }
        return -1;
    }
    public static int NonRep2(String str) {
        int fi[]=new int[256];
        Arrays.fill(fi,-1);
        for(int i=0;i<str.length();i++){
            if(fi[str.charAt(i)]==-1){
                fi[str.charAt(i)]=i;
            }
            else{
                fi[str.charAt(i)]=-2;
            }
        }
        int res=Integer.MAX_VALUE;
        for(int i=0;i<256;i++){
            if(fi[i]>=0){
                res=Math.min(res,fi[i]);
            }
        }
        return (res==Integer.MAX_VALUE)?-1:res;
    }
    public static void main(String[] args) {
        String str="geeksforgeeks";
        System.out.println(NonRep(str));
        System.out.println(NonRep1(str));
        System.out.println(NonRep2(str));
    }
}
