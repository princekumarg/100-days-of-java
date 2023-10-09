package Arrays;

import java.util.*;

public class LongestConsequtiveSequenec {
    public static int longestcommonsequence(int arr[]) {
        int n = arr.length;
        if (n == 0) {
            return 0;
        }
        Arrays.sort(arr);
        int largestsmall = Integer.MIN_VALUE;
        int largest = 1;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] - 1 == largestsmall) {
                cnt++;
                largestsmall = arr[i];
            } else if (arr[i] != largestsmall) {
                cnt = 1;
                largestsmall = arr[i];
            }
            largest = Math.max(largest, cnt);
        }
        return largest;
    }

    public static int longestcommonsequence1(int arr[]) {
        int n = arr.length;
        if (n == 0) {
            return 0;
        }
        int largest = 1;
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(arr[i]);
        }
        for (int it : hs) {
            if (hs.contains(it - 1) == false) {
                int cnt = 1;
                int x = it;
                while (hs.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                largest = Math.max(largest, cnt);
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = { 100, 200, 1, 2, 3, 4 };
        int ans = longestcommonsequence(arr);
        System.out.println(ans);
        int ans1 = longestcommonsequence1(arr);
        System.out.println(ans1);
    }
}
