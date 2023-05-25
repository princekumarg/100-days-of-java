package Searching;

public class serching_insert_index {
    public static int searchInsert(int[] nums, int target) {
        return binarySearch(nums , target); 
    }
    public static int binarySearch(int[] nums , int target){
        int l = 0 , r = nums.length - 1 , mid , ans = -1;
        while(l <= r){
            mid = l + (r - l) / 2;
            if(nums[mid] == target)
                return mid;
            if(nums[mid] < target){
                l = mid + 1;
                ans = mid + 1;
            }
            else{
                ans = mid;
                r = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String args[]) {
        int nums[]={1,2,3,5,6};
        int target=4;
        System.out.println(searchInsert(nums,target));   
    }
}
