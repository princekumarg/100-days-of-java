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
        int max = n - 1, min = 0;
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                ans[i] = arr2[max--];
            } else {
                ans[i] = arr2[min++];
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
            System.out.print(ans[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < ans1.length; i++) {
            System.out.print(ans1[i] + " ");
        }
        int arr2[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println();
        int ans2[] = alternativemax(arr2, arr2.length);
        for (int i = 0; i < ans2.length; i++) {
            System.out.print(ans2[i] + " ");
        }
    }
}
