package Arrays;

public class alternativeelement {
    public static int[] alternativenegpos(int arr[]) {
        int ans[] = new int[arr.length];
        int pos = 0, neg = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                ans[neg] = arr[i];
                neg = neg + 2;
            } else {
                ans[pos] = arr[i];
                pos = pos + 2;
            }
        }
        return arr;
    }

    public static int[] alternativevenodd(int arr1[]) {
        int ans[] = new int[arr1.length];
        int even = 0, odd = 1;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                ans[even] = arr1[i];
                even = even + 2;
            } else {
                ans[odd] = arr1[i];
                odd = odd + 2;
            }
        }
        return ans;
    }

    public static int[] alternativemax(int arr2[], int n) {
        int ans[] = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxi = 0, mini = 1;
        for (int i = 0; i < n; i++) {
            if (arr2[i] > max) {
                max = Math.max(max, arr2[i]);
                ans[maxi] = arr2[i];
                maxi = maxi + 2;
            }
            if (arr2[i] < min) {
                min = Math.min(min, arr2[i]);
                ans[mini] = arr2[i];
                mini = mini + 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -4, -1, -6 };
        int arr1[] = { 1, 2, 3, 4, 5, 6 };
        int ans[] = alternativenegpos(arr);
        int ans1[] = alternativevenodd(arr1);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i] + " ");
        }
        for (int i = 0; i < ans1.length; i++) {
            System.out.println(ans1[i] + " ");
        }
        int arr2[] = { 1, 2, 3, 4, 5, 6 };
        int ans2[] = alternativemax(arr2, arr2.length);
        for (int i = 0; i < ans2.length; i++) {
            System.out.println(ans2[i] + " ");
        }
    }
}
