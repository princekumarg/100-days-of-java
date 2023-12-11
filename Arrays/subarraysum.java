package Arrays;

import java.util.ArrayList;

public class subarraysum {
    public static ArrayList<Integer> subarraysumindex(int[] arr, int n, int k) {
        int sum = 0;
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sum = arr[i];
            for (int j = i + 1; j < n; j++) {
                sum = sum + arr[j];
                if (sum == k) {
                    res.add(i);
                    res.add(j);
                    return res;
                }
            }
        }
        return res;
    }

    public static ArrayList<Integer> subsum(int arr[], int n, int k) {
        int sum = 0;
        ArrayList<Integer> res = new ArrayList<>();
        int start = 0, end = 0;
        for (end = 0; end < n; end++) {
            sum = sum + arr[end];
            while (sum > k) {
                sum = sum - arr[start];
                start++;
            }

            if (sum == k && start <= end) {
                res.add(start);
                res.add(end);
            }
        }
        res.add(-1);
        return res;

    }

    public static int sumsubarrayindex(int[] arr, int n, int k) {
        int sum = 0;
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
                if (sum == k) {
                    res++;
                }
            }
        }
        return res;
    }

    public static int[] runningsum(int arr[], int n) {
        int temp[] = new int[n];
        if (n == 0) {
            return temp;
        }
        temp[0] = arr[0];
        for (int i = 1; i < n; i++) {
            temp[i] = temp[i - 1] + arr[i];
        }
        return temp;
    }

    public static int kandlealgorithm(int arr[], int n) {
        int sum = 0;
        int maxi = arr[0];
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            maxi = Math.max(maxi, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxi;
    }

    public static int kandlealgorithmmain(int arr[]) {
        int curr = 0;
        int maxi = Integer.MIN_VALUE;
        for (int i : arr) {
            curr = curr + i;
            maxi = Math.max(maxi, curr);
            if (curr < 0) {
                curr = 0;
            }
        }
        return maxi;
    }

    public static int kndlealgorithmii(int arr[]) {
        int total = 0;
        int currmaxsum = 0;
        int currminsum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int x : arr) {
            total = total + x;
            currmaxsum = Math.max(currmaxsum + x, x);
            currminsum = Math.min(currminsum + x, x);
            max = Math.max(max, currmaxsum);
            min = Math.min(min, currminsum);
        }
        return max < 0 ? max : Math.max(max, total - min);
    }

    public static int circluarsum(int[] arr, int n) {
        int res = arr[0];
        for (int i = 0; i < n; i++) {
            int curr_sum = arr[i];
            int curr_max = arr[i];
            for (int j = 1; j < n; j++) {
                int index = (i + j) % n;
                curr_sum = curr_sum + arr[index];
                curr_max = Math.max(curr_max, curr_sum);
            }
            res = Math.max(res, curr_max);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 2, -2, -20, 10 };
        int k = -10;
        int n = arr.length;
        System.out.println(sumsubarrayindex(arr, n, k));
        int ans[] = runningsum(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
        System.out.println(kandlealgorithm(arr, n));
        System.out.println(circluarsum(arr, n));
        System.out.println(kandlealgorithmmain(arr));
    }
}
