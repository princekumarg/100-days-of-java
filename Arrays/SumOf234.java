package Arrays;

import java.util.*;

public class SumOf234 {
    public static int[] TwoSum(int arr[], int target) {
        int n = arr.length;
        int ans[] = new int[2];
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int rem = target - arr[i];
            if (mp.containsKey(rem)) {
                ans[0] = mp.get(rem);
                ans[1] = i;
                return ans;
            }
            mp.put(arr[i], i);
        }
        return ans;
    }

    public static int[] sum2(int arr[], int temp) {
        int n = arr.length;
        Set<Integer> sl = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int rem = temp - arr[i];
            if (sl.contains(rem)) {
                return new int[] { rem, arr[i] };
            }
            sl.add(arr[i]);
        }
        return new int[] {};
    }

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

    public static List<List<Integer>> FourSum(int arr[], int target) {
        Set<List<Integer>> sl = new HashSet<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                Set<Integer> s = new HashSet<>();
                for (int k = j + 1; k < n; k++) {
                    int rem = target - (arr[i] + arr[j] + arr[k]);
                    if (s.contains(rem)) {
                        List<Integer> ls = Arrays.asList(arr[i], arr[j], arr[k], rem);
                        ls.sort(null);
                        sl.add(ls);
                    }
                    s.add(arr[k]);
                }
            }
        }
        List<List<Integer>> ll = new ArrayList<>(sl);
        return ll;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        List<List<Integer>> ans = ThreeSum(arr);
        System.out.println(ans);
        List<List<Integer>> ans1 = FourSum(arr, 10);
        System.out.println(ans1);
    }
}
