package Searching;

public class first_and_occurence {
    public static int[] searchRange(int[] nums, int target) {
        int l = search(nums, target);
        int r = search(nums, target + 1);
        return l == r ? new int[] {-1, -1} : new int[] {l, r - 1};
    }
    public static int search(int[] nums, int x) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] >= x) {
                right = mid;
            } 
            else {
                left = mid + 1;
            }
        }
        return left;
    }
    public static void findFirstAndLast(int nums[], int target)
    {
        int n = nums.length;
        int first = -1, last = -1;
        for (int i = 0; i < n; i++) {
            if (target != nums[i])
                continue;
            if (first == -1)
                first = i;
            last = i;
        }
        if (first != -1) {
            System.out.println("First Occurrence = "+ first);
            System.out.println("Last Occurrence = " + last);
        }
        else
            System.out.println("Not Found");
    }
    public static void main(String args[]) {
        int nums[]={5,7,7,8,8,10};
        int target=8;
        findFirstAndLast(nums,target);
       /*  int x=searchRange(nums, target);
        for(int i=0;i<nums.length;i++){
            System.out.println(x);
        }*/
    }
}
