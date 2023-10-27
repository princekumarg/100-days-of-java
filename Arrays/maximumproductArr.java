package Arrays;

public class maximumproductArr {
    public static int maxprod(int arr[]) {
        int maxi = Integer.MIN_VALUE;
        int pro = 1;
        for (int i = 0; i < arr.length; i++) {
            pro = pro * arr[i];
            maxi = Math.max(pro, maxi);
            if (pro == 1) {
                pro = 1;
            }
        }
        pro = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            pro = pro * arr[i];
            maxi = Math.max(maxi, pro);
            if (pro == 0) {
                pro = 1;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int arr[] = { 6, -3, -10, 0, 2 };
        System.out.println(maxprod(arr));
    }
}
