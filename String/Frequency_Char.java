package String;
import java.util.*;
public class Frequency_Char {
    static int SIZE = 26;
    public static void printCharWithFreq(String str){
        int n = str.length();
        int[] freq = new int[SIZE];
        for (int i = 0; i < n; i++)
            freq[str.charAt(i) - 'a']++;
        for (int i = 0; i < n; i++) {
            if (freq[str.charAt(i) - 'a'] != 0) {
                System.out.print(str.charAt(i));
                System.out.print("=");
                System.out.print(freq[str.charAt(i) - 'a'] + " ");
                freq[str.charAt(i) - 'a'] = 0;
            }
        }
 
    }
    public static void main(String args[]) {
        String str = "geeksforgeeks";
        printCharWithFreq(str);
    }

}
