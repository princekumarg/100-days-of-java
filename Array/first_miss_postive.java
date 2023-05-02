package Array;
import java.util.*;
public class first_miss_postive {
    public static void main(String args[]) {
        int []nums={1,-2,-3,0,2};
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int x=first_missnumber(arr);
        System.out.println(x);
        System.out.println(firstMissingPositive(nums));
    }
    public static int segregrate(int []arr) {
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]<0){
                int temp=arr[i];//arry[1,-2,-3,4,5] to array[-2,-3,1,4,5]
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        return i;
    }
    public static int first_missnumber(int []arr) {
        int start=segregrate(arr);
        int []arr1=new int[arr.length-start];
        int k=0;
        for(int i=start;i<arr.length;i++){
            arr1[k]=arr[i];//to split the array[-1,-2,-3,1,2,3]=array1[1,2,3] 
            k++;
        }
        for(int i=0;i<arr1.length;i++){
            int x=Math.abs(arr1[i]);
            if((x-1<arr1.length)&&(arr1[x-1]>0)){//chaning arr[1,2,3] to negative arr[-1,-2,-3]
                arr1[x-1]=-arr1[x-1];
            }
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>0){
                return i+1;
            }
        }
        return arr1.length+1;
    }
    public static int firstMissingPositive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 1;
        }
                
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] >= 1 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
                
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }
}
