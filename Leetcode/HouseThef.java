package Leetcode;

public class HouseThef {
    public static int rob(int[] nums) {
        int n=nums.length;
        
        if(n==0) return 0;
        if(n==1) return nums[0];
        
        int a[]=new int[n];
       
        a[0]=nums[0];
        a[1]=Math.max(nums[0],nums[1]);
        
        for(int i=2;i<n;i++)
            a[i]=Math.max(nums[i]+a[i-2], a[i-1]);
        
        return a[n-1];
    }
    public static void main(String args[]) {
        int nums[]={2,7,9,3,1};
        System.out.println(rob(nums));
    }
}
