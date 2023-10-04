package Searching;

public class findMinInSorted {
    public static int findmin(int arr[], int n) {
        int start = 0, end = n - 1;
        int ans = Integer.MAX_VALUE;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[start] <= arr[mid]) {
                ans = Math.min(ans, arr[start]);
                start = mid + 1;
            } else {
                ans = Math.min(ans, arr[mid]);
                end = mid - 1;
            }
        }
        return ans;
    }

    public static int findcountmin(int arr[], int n) {
        int start = 0, end = n - 1;
        int index = -1;
        int ans = Integer.MAX_VALUE;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[start] <= arr[end]) {
                if (arr[start] < ans) {
                    ans = arr[start];
                    index = start;
                }
                break;
            }
            if (arr[start] <= arr[mid]) {
                if (arr[start] < ans) {
                    ans = arr[start];
                    index = start;
                }
                start = mid + 1;
            } else {
                if (arr[mid] < ans) {
                    ans = arr[mid];
                    index = mid;
                }
                end = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int ans[] = { 4, 5, 6, 7, 0, 1, 2 };
        int n = ans.length;
        System.out.println(findmin(ans, n));
        System.out.println(findcountmin(ans, n));
    }
}
