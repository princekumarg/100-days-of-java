package Matrix;

public class searchingin2d {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0, end = n * m - 1;
        while (low <= end) {
            int mid = (low + end) / 2;
            int row = mid / m, col = mid % m;
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                low = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int n = arr.length;
        System.out.println(searchMatrix(arr, n));
    }
}
