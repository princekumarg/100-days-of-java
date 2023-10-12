package Searching;

import java.util.Arrays;

public class Aggressivecow {
    public static boolean canplace(int stalls[], int dist, int cows) {
        int n = stalls.length;
        int cntcow = 1;
        int last = stalls[0];
        for (int i = 1; i < n; i++) {
            if (stalls[i] - last >= dist) {
                cntcow++;
                last = stalls[i];
            }
            if (cntcow >= cows) {
                return true;
            }
        }
        return false;
    }

    public static int aggressiveCows(int[] stalls, int k) {
        int n = stalls.length;
        Arrays.sort(stalls);
        int start = 1;
        int end = stalls[n - 1] - stalls[0];
        while (start <= end) {
            int mid = (start + end) / 2;
            if (canplace(stalls, mid, k) == true) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        int stalls[] = { 1, 2, 4, 8, 9 };
        int k = 3;
        System.out.println(aggressiveCows(stalls, k));
    }
}
