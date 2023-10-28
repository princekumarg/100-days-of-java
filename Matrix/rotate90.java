package Matrix;

public class rotate90 {
    public static int[][] rotated(int matrix[][]) {
        int n = matrix.length;
        int rotate[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotate[i][j] = matrix[n - j - 1][i];
            }
        }
        return rotate;
    }

    public static void rotated1(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {// swap
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length / 2; j++) {// reverse
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - j - 1];
                matrix[i][matrix.length - j - 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int rotate[][] = rotated(matrix);
        for (int i = 0; i < rotate.length; i++) {
            for (int j = 0; j < rotate[0].length; j++) {
                System.out.print(rotate[i][j] + " ");
            }
        }
        System.out.println();
        rotated1(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
