package BitsManuplation;

public class bit_masking {
    public static void main(String args[]) {
        int n = 5;
        int i = 2;
        System.out.println(bitmasking(i));
        System.out.println(checkingithbits(n, i));
        System.out.println(setithbits(n, i));
        System.out.println(clearbits(n, i));
        System.out.println(updatebits(n, i, 1));
        System.out.println(clearLastIbits(n, i));
        System.out.println(togglingbits(n, i));
    }

    public static int bitmasking(int i) {
        int mask = 1 << i;
        return mask;
    }

    public static int checkingithbits(int n, int i) {
        int mask = bitmasking(i);
        if ((n & mask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setithbits(int n, int i) {
        int mask = bitmasking(i);
        return n | mask;
    }

    public static int clearbits(int n, int i) {
        int mask = ~bitmasking(i);
        return n & mask;
    }

    public static int updatebits(int n, int i, int v) {
        int mask = ~bitmasking(i);
        int clear = n & mask;
        return clear | (v << i);
    }

    public static int clearLastIbits(int n, int i) {
        int mask = ~(-1 << i);
        return n & mask;
    }

    public static int togglingbits(int n, int i) {
        int mask = bitmasking(i);
        return n ^ mask;
    }
}
