package Day8;
import java.util.*;
public class suffle_array {
    public static int[] shuffle1(int[] nums, int n) {
        int []ans=new int[2*n];
        int j=0;
        for(int i=0;i<2*n;i=i+2){
            ans[i]=nums[j];
            ans[i+1]=nums[j+n];
            j++;
        }
        return ans;
    }
    public static int[] shuffle2(int[] nums,int n) {
        for(int i=0;i<n;i++){
            nums[i+n]+=nums[i]*1005;
        }
        for(int i=0;i<n;i++){
            nums[2*i]=nums[i+n]/1005;
            nums[2*i+1]=nums[i+n]%1005;
        }
        return nums;
    }
    public static int[] shuffle3(int[] nums,int n) {
        for(int i=0;i<n;i++){
            nums[i+n]<<=10;
            nums[i+n]|=nums[i];
        }
        for(int j=0;j<n;j++){
            int n1=nums[j+n]&1023;
            int n2=nums[j+n]>>10;
            nums[2*j]=n1;
            nums[2*j+1]=n2;
        }
        return nums;
    }
    public static void main(String args[]) {

        int []nums={2,5,1,3,4,7};
        int n=3;
        int[] output1 = shuffle1(nums, n);
        int[] output2 = shuffle2(nums, n);
        int[] output3 = shuffle3(nums, n);
        for(int i=0;i<2*n;i++){
            System.out.print(output1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<2*n;i++){
            System.out.print(output2[i]+" ");
        }
        System.out.println();
        for(int i=0;i<2*n;i++){
            System.out.print(output3[i]+" ");
        }
    }
}
