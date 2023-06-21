package String;

public class IsPresent {
    public static boolean areAnagram(String pat,String txt,int i) {
        int count[]=new int[256];
        for(int j=0;j<pat.length();j++){
            count[pat.charAt(j)]++;
            count[txt.charAt(i+j)]--;
        }
        for(int j=0;j<256;j++){
            if(count[j]!=0){
                return false;
            }
        }
        return true;
    }
    static boolean compare(char arr1[], char arr2[])
    {
        for (int i = 0; i < 256; i++)
            if (arr1[i] != arr2[i])
                return false;
        return true;
    }
    public static boolean ispresent(String txt,String pat) {
        int n=txt.length();
        int m=pat.length();
        for(int i=0;i<=(n-m);i++){
            if(areAnagram(pat,txt,i)){
                return true;
            }
        }
        return false;
    }
    public static boolean ispresent1(String txt,String pat) {
 
        // countP[]:  Store count of all
        // characters of pattern
        // countTW[]: Store count of current
        // window of text
        char[] countP = new char[256];
        char[] countTW = new char[256];
        for (int i = 0; i < pat.length(); i++)
        {
            (countP[pat.charAt(i)])++;
            (countTW[txt.charAt(i)])++;
        }
 
        // Traverse through remaining characters
        // of pattern
        for (int i = pat.length(); i < txt.length(); i++)
        {
            // Compare counts of current window
            // of text with counts of pattern[]
            if (compare(countP, countTW))
                return true;
             
            // Add current character to current
            // window
            (countTW[txt.charAt(i)])++;
 
            // Remove the first character of previous
            // window
            countTW[txt.charAt(i-pat.length())]--;
        }
 
        // Check for the last window in text
        return false;
    }
    public static void main(String[] args) {
        String txt="ABCDE";
        String pat="BCD";
        System.out.println(ispresent(txt,pat));
        System.out.println(ispresent1(txt,pat));
    }
}
