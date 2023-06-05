package Leetcode;

public class two_sum {
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int low = 0, high = numbers.length - 1;
        if(numbers.length < 2) return null;
        while(low < high){
            int sum = numbers[low] + numbers[high];
            if(sum == target){
                result[0] = low + 1;
                result[1] = high + 1;
                break;
            }else if(sum > target)
                high--;
            else
                low++;
        }
        return low >= high ? null : result;
    }
    public static int[] twoSum1(int[] numbers, int target) {
        int len = numbers.length;
        for(int i = 0; i < len-1; i++){
            int find = target - numbers[i];
            for(int j = i + 1; j < len; j++){
                if(numbers[j] == find){
                    return new int[]{i + 1, j + 1};
                }else if(numbers[j] > find)
                    break;
            }
        }
        return null;
    }
    public static void main(String args[]) {
        int nums[]={2,7,11,15};
        int target=9;
        System.out.println(twoSum(nums, target));
        System.out.println(twoSum1(nums, target));
    }
}
