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
