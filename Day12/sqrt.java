package Day12;
import java.util.*;

import javax.sound.midi.MidiDeviceReceiver;
public class sqrt {
    public static int sqrt(int n) {
        int i=1;
        while(i*i<=n){
            i++;
        }
        return i-1;
    }
    public static int sqrt1(int n) {
        int start=0,end=n,ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            int midsq=mid*mid;
            if(midsq==n){
                return mid;
            }
            else if(midsq>n){
                end=mid-1;
            }
            else{
                start=mid+1;
                ans=mid;
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
