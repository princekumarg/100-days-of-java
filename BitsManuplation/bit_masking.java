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
        System.out.println(counttotalbits(n, i));
        System.out.println(powerof2(n));
        System.out.println(checkevenorodd(n));
        swap(n, i);
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

    public static int counttotalbits(int n, int i) {
        return (int) (Math.log(n) / Math.log(i)) + 1;
    }

    public static String powerof2(int n) {
        if ((n & (n - 1)) == 0) {
            return "yes";
        } else {
            return "no";
        }
    }

    public static String checkevenorodd(int n) {
        if ((n & 1) == 1) {
            return "odd";
        } else {
            return "even";
        }
    }

    public static void swap(int n, int i) {
        n = n ^ i;
        i = n ^ i;
        n = n ^ i;
        System.out.println(n + " " + i);
    }
}
