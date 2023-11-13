package Matrix;

public class PeakElement {
    public static int rowmax(int mat[][], int n, int m, int col) {
        int max = -1;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (mat[i][col] > max) {
                max = mat[i][col];
                index = -1;
            }
        }
        return index;
    }

    public static int[] peak(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;
        int low = 0, high = m - 1;
        if (low <= high) {
            int mid = (low + high) / 2;
            int maxrow = rowmax(mat, n, m, mid);
            int left = mid - 1 >= 0 ? mat[maxrow][mid - 1] : -1;
            int right = mid + 1 < m ? mat[maxrow][mid + 1] : -1;
            if (mat[maxrow][mid] > left && mat[maxrow][mid] > right) {
                return new int[] { maxrow, mid };
            } else if (mat[maxrow][mid] < left) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int mat[][] = { { 10, 8, 10, 10 }, { 14, 13, 12, 11 }, { 15, 9, 11, 21 }, { 16, 17, 19, 20 } };
        int ans[] = peak(mat);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
