package GFG;

//[1,2,3,2,1] after reversing we will get [1,2,3,2,1] that is reversing of an array
public class PerfectArray {
    public static boolean perfect(int a[]) {
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] != a[a.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 2, 1 };
        System.out.println(perfect(a));
    }
}
