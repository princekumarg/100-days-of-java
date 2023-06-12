package String;

import java.util.Arrays;

public class Permutauon_String_or_not {
    public static boolean permutation(String s1,String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        char a1[]=s1.toCharArray();
        Arrays.sort(a1);
        s1=new String(a1);
        char a2[]=s1.toCharArray();
        Arrays.sort(a2);
        s1=new String(a2);
        return s1.equals(s2);
    }
    public static boolean permutation1(String s1,String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        int count[]=new int[256];
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int i=0;i<256;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1="bac";
        String s2="abc";
        System.out.println(permutation(s1, s2));
        System.out.println(permutation1(s1,s2));
    }
}
