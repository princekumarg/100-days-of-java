package Matrix;

public class MedianArray {
    public static int median(int mat[][], int row, int col) {
        int median[] = new int[row * col];
        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                median[index] = mat[i][j];
                index++;
            }
        }
        return median[index / 2];
    }

    public static int countSmallerThanMid(int[] arr, int mid, int n) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int md = (low + high) >> 1;
            if (arr[md] <= mid) {
                low = md + 1;
            } else {
                high = md - 1;
            }
        }
        return low;
    }

    public static int findmedian(int[][] arr, int row, int col) {
        int low = Integer.MIN_VALUE, high = Integer.MAX_VALUE;
        int n = row;
        int m = col;
        while (low <= high) {
            int mid = (low + high) >> 1;
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                cnt += countSmallerThanMid(arr[i], mid, col);
            }
            if (cnt <= (n * m) / 2) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int mat[][] = { { 1, 3, 5 }, { 2, 6, 9 }, { 3, 6, 9 } };
        System.out.println(median(mat, 3, 3));
        System.out.println(findmedian(mat, 3, 3));
    }
}
