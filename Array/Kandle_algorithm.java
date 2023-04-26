package Array;

public class Kandle_algorithm {
    public static int maxSubArray(int[] nums){
        int max_sum = Integer.MIN_VALUE;
        int cur=0;
        for(int x:nums)
        {
            if(cur<0) cur=0;
            cur += x;
            max_sum =  Math.max(max_sum , cur);
        }
        return max_sum;
    }
    
  public static void main(String args[]){
    int[] nums={-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(maxSubArray(nums));
  }
}
