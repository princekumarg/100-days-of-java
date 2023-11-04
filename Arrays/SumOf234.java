package Arrays;

import java.util.*;

public class SumOf234 {
    public static List<List<Integer>> ThreeSum(int arr[]) {
        Set<List<Integer>> sl = new HashSet<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            Set<Integer> s = new HashSet<>();
            for (int j = 0; j < n; j++) {
                int temp = -(arr[i] + arr[j]);
                if (s.contains(temp)) {
                    List<Integer> ls = Arrays.asList(arr[i], arr[j], temp);
                    ls.sort(null);
                    sl.add(ls);
                }
                s.add(arr[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(sl);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };

    }
}
