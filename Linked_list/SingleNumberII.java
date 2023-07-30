package Linked_list;

public class SingleNumberII {
    public static int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                if (((nums[j] >> i) & 1) == 1) {// to check 1 in row
                    sum++;
                }
            }
            sum %= 3;
            if (sum != 0) {
                ans |= sum << i;// used to set bit
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 2 };// [2,2,3,2]=[010,010,011,010] in binary
        System.out.println(singleNumber(arr));
    }
}
