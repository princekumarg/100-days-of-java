package String;

public class LexoGrapgicalRank {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static int LexRank(String str) {
        int res=1;
        int n=str.length();
        int mul=fact(n);
        char count[]=new char[256];
        for(int i=0;i<n;i++){
            count[str.charAt(i)]++;
        }
        for(int i=1;i<256;i++){
            count[i]+=count[i-1];
        }
        for(int i=0;i<n-1;i++){
            mul=mul/(n-i);
            res=res+count[str.charAt(i)-1]*mul;
            for(int j=str.charAt(i);j<256;j++){
                count[j]--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String str="string";
        System.out.println(LexRank(str));
    }
}
