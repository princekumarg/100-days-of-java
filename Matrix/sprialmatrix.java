package Matrix;

import java.util.ArrayList;
import java.util.List;

public class sprialmatrix {
    public static List<Integer> sprialmatrixcks(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0, right = m - 1;
        int top = 0, bottom = n - 1;
        List<Integer> ls = new ArrayList<>();
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                ls.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                ls.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ls.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ls.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ls;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        List<Integer> ls = sprialmatrixcks(matrix);
        for (int i = 0; i < ls.size(); i++) {
            System.out.print(ls.get(i) + " ");
        }
    }
}
