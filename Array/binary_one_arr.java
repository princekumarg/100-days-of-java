package Array;
import java.util.*;
public class binary_one_arr {
    public static int consequtive_array(boolean arr[]) {
        int res=0;
        for(int i=0;i<arr.length;i++){
            int curr=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==true){
                    curr++;
                    res=Math.max(res,curr);
                }
                else{
                    curr=0;
                }
            }
        }
        return res;
    }
    public static int max_consequtive(boolean []arr) {
        int res=0,curr=0;;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==true){
                curr++;
                res=Math.max(res,curr);
            }
            else{
                curr=0;
            }
        }
        return res;
    }
    public static int consequtive_even_odd(int []nums) {
        int res=1,curr=1;;
        for(int i=1;i<nums.length;i++){
            if((nums[i]%2==0 && nums[i-1]%2!=0)||(nums[i]%2!=0 && nums[i-1]%2==0)){
                curr++;
                res=Math.max(res,curr);
            }
            else{
                curr=1;
            }
        }
        return res;
    }
    public static void main(String args[]) {
        boolean []arr={false,true,true,true,true,false,false,true};
        int []nums={2,3,4,5,6,7};
        System.out.println(consequtive_array(arr));
        System.out.println(max_consequtive(arr));
        System.out.println(consequtive_even_odd(nums));
    }
}
