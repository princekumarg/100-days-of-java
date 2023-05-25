package SortingAlgo;
import java.util.*;
public class majorityElement {
    public static int majorityElement1(int[] nums) {
        if (nums.length == 1) {
		return nums[0];
	    }
        Arrays.sort(nums);
	    return nums[nums.length / 2];
    }
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            return true;
        }
        return false;
    }
    public static void main(String args[]) {
        int nums[]={3,2,3};
        System.out.println(majorityElement1(nums));
        containsDuplicate(nums);
    }
}
