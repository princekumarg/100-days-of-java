package Searching;

public class Implementing_Lower_Upper {
    public static int lower(int arr[], int n, int x) {
        int start = 0, end = n - 1;
        int mid = (start + end) / 2;
        int ans = n;
        while (start <= end) {
            if (arr[mid] >= x) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static int lower1(int arr[], int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] >= x) {
                return i;
            }
        }
        return n;
    }

    public static int upper(int arr[], int n, int x) {
        int start = 0, end = n - 1;
        int mid = (start + end) / 2;
        int ans = n;
        while (start <= end) {
            if (arr[mid] > x) { // if(arr[mid]<=x) for upper bound
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static int searchinsert(int arr[], int n, int x) {
        return lower(arr, n, x);
    }

    public static int floor(int arr[], int n, int x) {
        int start = 0, end = n - 1;
        int mid = (start + end) / 2;
        int ans = -1;
        while (start <= end) {
            if (arr[mid] <= x) {
                ans = arr[mid];
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static int ceil(int arr[], int n, int x) {
        int start = 0, end = n - 1;
        int mid = (start + end) / 2;
        int ans = -1;
        while (start <= end) {
            if (arr[mid] >= x) {
                ans = arr[mid];
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = arr.length;
        int x = 2;
        System.out.println(lower(arr, n, x));
        System.out.println(lower1(arr, n, x));
        System.out.println(upper(arr, n, x));
        System.out.println(searchinsert(arr, n, x));
        System.out.println(floor(arr, n, x));
        System.out.println(ceil(arr, n, x));
    }
}
