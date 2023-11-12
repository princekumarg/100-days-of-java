package Matrix;

import java.util.ArrayList;
import java.util.Arrays;

public class count_ones_row {
    public static int lowerbound(ArrayList<Integer> arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int countones(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        int cnt_max = 0;
        int index = -1;
        for (int i = 0; i < n; i++) {
            int cnt_ones = m - lowerbound(matrix.get(i), m, 1);
            if (cnt_ones > cnt_max) {
                cnt_max = cnt_ones;
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 0)));
        int n = 3, m = 3;
        System.out.println(countones(matrix, n, m));
    }
}
