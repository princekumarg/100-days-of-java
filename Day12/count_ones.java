package Day12;
import java.util.*;
public class count_ones {
    public static int countones(int []arr) {
        int start=0,end=arr.length-1;
        while(start<=end){
            int median=(start+end)/2;
            if(arr[median]==0){
                return start=median+1;
            }
            else{
                if(median==0 || arr[median-1]==0){
                    return (arr.length-median);
                }
                else{
                    return end=median-1;
                }
            }
        }
        return 0;
    }
    public static void main(String args[]) {
        int []arr={0,0,1,1,1,1};
        System.out.println(countones(arr));
    }
}
