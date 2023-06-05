package Leetcode;

public class Minmum_using_sorting {
    public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1; 
        while(low < high){ 
            int mid = (low+high)/2; 
            if(nums[mid] < nums[high]){
                high = mid; 
            } 
            else if(nums[mid] > nums[high]){
                low = mid+1; 
            } 
            else{
                high -= 1; 
            } 
        } 
        return nums[low]; 
    }
    public static void main(String args[]) {
        int nums[]={4,5,6,7,0,1,4};
        System.out.println(findMin(nums));
    }
}
