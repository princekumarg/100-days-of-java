package String;

public class SubSequence {
    public static boolean issubseq(String s1,String s2) {
        int n=s1.length();
        int m=s2.length();
        int j=0;
        for(int i=0;(i<n && j<m);i++){
            if(s1.charAt(i)==s2.charAt(j)){
                j++;
            }
        }
        return (j==m);
    }
    public static boolean issubseq1(String s1,String s2,int n,int m) {
        if(m==0){
            return true;
        }
        if(n==0){
            return false;
        }
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return issubseq1(s1, s2,n-1,m-1);
        }
        else{
            return issubseq1(s1, s2, n-1, m);
        }
    }
    public static void main(String[] args) {
        String s1="prince";
        String s2="ince";
        System.out.println(issubseq(s1, s2));
        System.out.println("////Second Output////");
        int n=s1.length();
        int m=s2.length();
        System.out.println(issubseq1(s1,s2,n,m));

    }
}
