package Arrays;

public class subarraysum {
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
        int maxsum = 0;
        int minsum = 0;
        for (int x : arr) {
            total = total + x;
            currmaxsum = Math.max(currmaxsum + x, x);
            currminsum = Math.min(currminsum + x, x);
            maxsum = Math.max(maxsum, currmaxsum);
            minsum = Math.min(minsum, currminsum);
        }
        return maxsum < 0 ? maxsum : Math.max(maxsum, total - minsum);
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
