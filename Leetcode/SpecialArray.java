package Leetcode;

public class SpecialArray {
    public static int specialArray(int[] nums) {
        int n = nums.length , counter = 0;
        for(int i = 1 ; i <= n ; i++)
        {
            counter = 0;
            for(int j = 0 ; j < n ; j++)
                if(nums[j] >= i)
                    counter++;
            if(counter == i)
                return i;
        }
        return -1;
    }
    public static void main(String args[]) {//[3,5]=2
        int[] nums = {1 , 3 , 4 , 5};
        System.out.println(specialArray(nums));
    }
}
