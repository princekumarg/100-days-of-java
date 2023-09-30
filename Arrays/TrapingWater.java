package Arrays;

public class TrapingWater {
    public static int water_level1(int A[]) {// 0(n^2)
        int res = 0;
        for (int i = 1; i < A.length; i++) {
            int left = A[i];
            for (int j = 0; j < i; j++) {
                left = Math.max(left, A[j]);
            }
            int right = A[i];
            for (int j = i; j < A.length; j++) {
                right = Math.max(right, A[j]);
            }
            res = res + Math.min(left, right) - A[i];
        }
        return res;
    }

    public static int water_level(int A[]) { // 0(n)
        int res = 0;
        if (A.length == 0) {
            return 0;
        }
        int[] leftMax = new int[A.length];

        int[] rightMax = new int[A.length];

        leftMax[0] = A[0];

        for (int i = 1; i < leftMax.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], A[i]);
        }

        rightMax[A.length - 1] = A[A.length - 1];

        for (int j = rightMax.length - 2; j >= 0; j--) {
            rightMax[j] = Math.max(rightMax[j + 1], A[j]);
        }
        for (int x = 0; x < A.length; x++) {
            res += Math.min(leftMax[x], rightMax[x]) - A[x];
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 6, 7, 8, 1, 4 };
        System.out.println(water_level(arr));
    }
}
