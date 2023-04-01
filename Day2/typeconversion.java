package Day2;

public class typeconversion {
    public static void main(String args[]) {
        int i = 100;
        double d = 100.04;
        long l = i;
        float f = l;
        long k = (long)d;
        int p = (int)k;
        System.out.println("Double value " + d);
        System.out.println("Long value " + k);
        System.out.println("Int value " + p);
        System.out.println("Int value " + i);
        System.out.println("Long value " + l);
        System.out.println("Float value " + f);
    }
}
