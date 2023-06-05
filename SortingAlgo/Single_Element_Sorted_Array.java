package SortingAlgo;
import java.util.*;
public class Single_Element_Sorted_Array {
    public static int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        
        while(low < high){
            
            int mid = (low+high)/2;
            if(nums[mid] == nums[mid^1]){
                low = mid+1;
            }
            else{
                high = mid;
            }
            
            
        }
        return nums[low];
    }
    public static void searchthesingle(int[] arr,int low,int high){
        if (low > high)
            return;
        if (low == high) {
            System.out.println("The required element is" + arr[low]);
            return;
        }
        int mid = (low + high) / 2;
        if (mid % 2 == 0) {
            if (arr[mid] == arr[mid + 1])
                searchthesingle(arr, mid + 2, high);
            else
                searchthesingle(arr, low, mid);
        }
        else if (mid % 2 == 1) {
            if (arr[mid] == arr[mid - 1])
                searchthesingle(arr, mid + 1, high);
            else
                searchthesingle(arr, low, mid - 1);
        }
    }
    public static void main(String args[]) {
        int nums[]={1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
        int arr[]={1, 1, 3, 3, 4, 5, 5, 7, 7, 8, 8};
        int low = 0;
        int high = arr.length-1;
        searchthesingle(arr, low, high);
    }
}
