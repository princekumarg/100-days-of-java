package Arrays;

public class TrapingWater {
    public static int water_level(int A[]) {
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
