package Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Mergeoverlapping {
    public static int[][] mergingoverping(int arr[][]) {
        if (arr.length <= 1) {
            return arr;
        }
        Arrays.sort(arr, Comparator.comparingInt(i -> i[0]));
        List<int[]> ans = new ArrayList<>();
        int[] curr = arr[0];
        ans.add(curr);
        for (int[] x : arr) {
            if (x[0] <= curr[1]) {
                curr[1] = Math.max(curr[1], x[1]);
            } else {
                curr = x;
                ans.add(curr);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        int ans[][] = mergingoverping(arr);
        for (int[] x : ans) {
            System.out.println(Arrays.toString(x));
        }

    }
}
