package Matrix;

public class sortbysecondele {
    public static int[][] sortingsecond(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i][1] > arr[j][1]) {
                    int temp = arr[i][1];
                    arr[i][1] = arr[j][1];
                    arr[j][1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 }, { 9, 10 } };
        int ans[][] = sortingsecond(arr);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.println(ans[i][j]);
            }
        }
    }
}
