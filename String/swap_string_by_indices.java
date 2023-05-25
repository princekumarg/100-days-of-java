package String;
import java.util.*;
public class swap_string_by_indices {
    public static String restoreString1(String s, int[] indices) {
        StringBuilder res = new StringBuilder(s);
        for(int i =0; i < indices.length; ++i){
            res.setCharAt(indices[i],s.charAt(i));
        }
        return res.toString();
    }
    public static String restoreString2(String s,int[] indices) {
        char arr[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr[indices[i]]=s.charAt(i);
        }
        String res=String.valueOf(arr);
        return res;
    }
    public static void main(String args[]) {
        String s="codeleet";
        int [] indices={4,5,6,7,0,2,1,3};
        System.out.println(restoreString1(s,indices));
        System.out.println(restoreString2(s,indices));
    }
}
