package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public static List<Boolean> findless(int arr[], int k) {
        int max = 0;
        List<Boolean> ans = new ArrayList<>();
        for (int x : arr) {
            max = Math.max(max, x);
        }
        for (int x : arr) {
            ans.add(x + k >= max);
        }
        return ans;
    }

    public static int[] countarray(int arr[]) {
        Map<Integer, Integer> m = new HashMap<>();
        int copy[] = arr.clone();
        Arrays.sort(copy);
        for (int i = 0; i < arr.length; i++) {
            m.putIfAbsent(copy[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            copy[i] = m.get(arr[i]);
        }
        return copy;
    }

    public static int[] shufflearray(int arr[], int n) {
        /*
         * int res[] = new int[2 * n];
         * for (int i = 0; i < n; i++) {
         * res[2 * i] = arr[i];
         * res[2 * i + 1] = arr[i + n];
         * }
         * return res;
         */
        for (int i = n; i < 2 * n; i++) {
            arr[i] = arr[i] << 10;
            arr[i] |= arr[i - n];
        }
        int z = n;
        for (int i = 0; i < 2 * n; i++) {
            arr[i] = arr[z] & 1023;
            arr[i] = arr[z++] >> 10;
        }
        return arr;
    }

    public static int[] sumzeros(int n) {
        int res[] = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = 2 * i - n + 1;
        }
        return res;
    }

    public static int[] pulseone(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        int res[] = new int[arr.length + 1];
        res[0] = 1;
        return res;

    }

    public static int findmax(int arr[]) {
        int even = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                even++;
            }
        }
        return Math.min(even, arr.length - even);
    }

    public static int findmaxalitude(int arr[]) {
        int max = 0;
        int prefix[] = new int[arr.length + 1];
        prefix[0] = 0;
        for (int i = 0; i < arr.length; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }
        for (int i = 0; i < prefix.length; i++) {
            max = Math.max(max, prefix[i]);
        }
        return max;
    }

    public static int[] decodedArrays(int arr[], int n, int first) {
        int tem[] = new int[n + 1];
        tem[0] = first;
        for (int i = 0; i < n; i++) {
            tem[i + 1] = tem[i] ^ arr[i];
        }
        return tem;
    }

    public static int maxfreq(int arr[]) {
        int max = 0;
        int el = 0;
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
            if (m.get(arr[i]) > max) {
                max = m.get(arr[i]);
                el = arr[i];
            }
        }
        return el;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 2, 1, 5, 3, 4 };
        int res[] = permutationarray(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }

}
