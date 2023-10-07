package Searching;

public class koko {// [3,6,7,8] banan=2 unit/hr divide all element by 2 ceil output [2,3,4,4]
    public static int maximum(int arr[]) {// 2+3+4+4=13 ans;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxi = Math.max(maxi, arr[i]);
        }
        return maxi;
    }

    public static int calculate(int arr[], int hrs) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + (int) Math.ceil((double) arr[i] / hrs);
        }
        return sum;
    }

    public static int kokoh(int arr[], int hrs) {
        int start = 1, end = maximum(arr);
        while (start <= end) {
            int mid = (start + end) / 2;
            int kokoe = calculate(arr, mid);
            if (kokoe <= hrs) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 15, 6, 3 };
        int hrs = 8;
        System.out.println(kokoh(arr, hrs));
    }
}
