package Matrix;

import java.util.ArrayList;
import java.util.List;

public class PascalTri {
    public static int ncr(int n, int r) {
        long res = 1;
        for (int i = 0; i < r; i++) {
            res *= (n - i);
            res /= (i + 1);
        }
        return (int) res;
    }

    public static List<List<Integer>> pascaltriangle(int n) {
        List<List<Integer>> ls = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                l.add(ncr(i - 1, j - 1));
            }
            ls.add(l);
        }
        return ls;
    }

    public static int[][] pascaltriangle1(int n) {
        int arr[][] = new int[n][n];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                arr[i - 1][j - 1] = ncr(i - 1, j - 1);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ls = pascaltriangle(n);
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 0; j < ls.get(i).size(); j++) {
                System.out.println(ls.get(i).get(j) + " ");
            }
        }
    }
}
