package Searching;

public class find_duplicate {
    public static int findDuplicate(int[] nums) {
        int tortoise = nums[0];
        int hare = nums[0];
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);
        tortoise = nums[0];
        
        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }
        return hare;
    }
    public static void main(String args[]) {
        int nums[]={1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
}
