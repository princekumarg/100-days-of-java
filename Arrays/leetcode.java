package Arrays;

import java.util.ArrayList;
import java.util.List;

public class leetcode {
    public static int[] permutationarray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] *= n;
        }
        for (int i = 0; i < n; i++) {
            arr[i] += arr[arr[i] / n] / n;
        }
        for (int i = 0; i < n; i++) {
            arr[i] %= n;
        }
        return arr;
    }

    public static int[] concateArray(int arr[]) {
        int n = arr.length;
        int res[] = new int[2 * n];
        for (int i = 0; i < n; i++) {
            res[i] = arr[i];
            res[i + n] = arr[i];
        }
        return res;
    }

    public static int[] runningsumjava(int arr[]) {
        int n = arr.length;
        int res[] = new int[n];
        if (arr.length == 0)
            return res;
        res[0] = arr[0];
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] + arr[i];
        }
        return res;
    }

    public static List<Boolean> findless(int arr[], int k) {
        int max = 0;
        List<Boolean> ans = new ArrayList<>();
        for (int x : arr) {
            max = Math.max(x, max);
        }
        for (int x : arr) {
            ans.add(k + x >= max);
        }
        return ans;
    }

    public static int findpair(int arr[]) {
        int res = 0;
        int cnt[] = new int[101];
        for (int x : arr) {
            res += cnt[x]++;
        }
        return res;
    }

    public static int[] countSmaller(int arr[]) {// in 0(n^2)
        int n = arr.length;
        int res[] = new int[n];
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    cnt++;
                }
            }
            res[i] = cnt;
        }
        return res;
    }

    public static int increasingarr(int arr[]) {// [3,2,5,1,7]==[3,3,5,5,7]
        int res = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {
                continue;
            } else {
                res += arr[i - 1] - arr[i];
                arr[i] = arr[i - 1];
            }
        }
        return res;
    }

    public static boolean addtion(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & 1) == 1) {
                count++;
            }
        }
        return count % 2 == 0;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 2, 1, 5, 3, 4 };
        int res[] = permutationarray(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }

}
