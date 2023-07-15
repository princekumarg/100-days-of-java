package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumm {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int p = i + 1, q = n - 1;
            while (p < q) {
                if (nums[p] + nums[q] == -nums[i]) { // System.out.println(p+" "+q);
                    List<Integer> t = new ArrayList<Integer>();
                    t.add(nums[i]);
                    t.add(nums[p]);
                    t.add(nums[q]);

                    ans.add(t);

                    while (p + 1 < q && nums[p + 1] == nums[p])
                        p++;
                    while (q - 1 > p && nums[q - 1] == nums[q])
                        q--;

                    p++;
                    q--;
                } else if (nums[p] + nums[q] < -nums[i])
                    p++;
                else
                    q--;
            }

            while (i + 1 < n && nums[i + 1] == nums[i])
                i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        for (List<Integer> list : threeSum(nums)) {
            for (int x : list)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}
