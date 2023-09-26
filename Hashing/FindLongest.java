package Hashing;

import java.util.Arrays;
import java.util.HashSet;

//[1,9,3,4,2,20]==[1,2,3,4,9,20] so maxlongestsub is [1,2,3,4]
public class FindLongest {
    public static int longestsub(int arr[], int n) {
        Arrays.sort(arr);
        int res = 1, curr = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                curr++;
            } else {
                res = Math.max(res, curr);
                curr = 1;
            }
        }
        res = Math.max(res, curr);
        return res;
    }

    public static int longestsub1(int arr[], int n) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(arr[i]);
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (!hs.contains(arr[i] - 1)) {
                int curr = 1;
                while (hs.contains(curr + arr[i])) {
                    curr++;
                }
                res = Math.max(res, curr);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 9, 3, 4, 2, 20 };
        int n = arr.length;
        System.out.println(longestsub(arr, n));
        System.out.println(longestsub1(arr, n));
    }
}
