package Arrays;

public class QuestiononOperation {
    public static int removeval(int arr[], int val, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != val) {
                arr[count++] = arr[i];
            }
        }
        return count;
    }

    public static int removeeven(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != (arr[i] & 1)) {
                arr[count++] = arr[i];
            }
        }
        return count;
    }

    public static int[] countless(int arr[], int n) {
        int count = 0;
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }

    public static int[] pluseone(int arr1[], int n) {
        int ans[] = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            if (arr1[i] < 9) {
                arr1[i]++;
                return arr1;
            }
            arr1[i] = 0;
        }
        ans[0] = 1;
        return ans;
    }

    public static int[] runingsum(int arr[]) {
        int temp[] = new int[arr.length];
        temp[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            temp[i] = temp[i - 1] + arr[i];
        }
        return temp;
    }

    public static int removeMaxandMin(int nums[]) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int max1 = 0, min1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                max1 = i;
            }
            if (nums[i] < min) {
                min = nums[i];
                min1 = i;
            }
        }
        int nums1 = Math.max(max1 + 1, min1 + 1);
        int nums2 = Math.max(nums.length - max1, nums.length - min1);
        int nums3 = Math.min(max1 + 1, min1 + 1) + Math.min(nums.length - max1, nums.length - min1);
        return Math.min(Math.min(nums1, nums2), nums3);
    }

    public static int circlegame(int n, int k) {
        if (n == 1) {
            return 0;
        }
        int ans = (circlegame(n - 1, k) + k) % n;
        return ans == 0 ? n : ans;
    }

    public static int countpairsum(int arr[], int k) {
        int i = 0;
        int j = arr.length - 1;
        int count = 0;
        while (i < j) {
            if (arr[i] + arr[j] < k) {
                i++;
            } else if (arr[i] + arr[j] > k) {
                j--;
            } else {
                count++;
                i++;
                j--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 3, 2, 1 };
        int n = arr.length;
        int val = 3;
        n = removeval(arr, val, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int ans[] = countless(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
        int arr1[] = { 9, 9, 9 };
        int ans1[] = pluseone(arr1, n);
        for (int i = 0; i < n; i++) {
            System.out.println(ans1[i] + " ");
        }
        int temp[] = runingsum(arr);
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i] + " ");
        }
    }
}
