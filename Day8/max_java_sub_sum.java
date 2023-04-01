package Day8;
import java.util.*;
public class max_java_sub_sum {
    public static void main(String args[]) {
        int []arr={1,2,3,5,-2};
        int sum=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
           sum=0;
           for(int j=i;j<arr.length;j++){
                sum=sum+arr[i];
                if(sum>max){
                     max=sum;
                }
            }
        }
        System.out.println("The max sum is="+max);   
    }
}
