package Hashing;

import java.util.HashSet;

public class Intersection {
    public static int intersection(int a[], int b[]) {
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j < i - 1; j++) {
                if (a[j] == a[i]) {
                    flag = true;
                    break;
                }
            }
            if (flag == true) {
                continue;
            }
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    res++;
                    break;
                }
            }
            /*
             * for(int j=0;j<b.length;j++){
             * if(a[i]==b[j]){
             * sout(a[i]);
             * break;
             * }
             * }
             */
        }
        return res;
    }

    public static int intersection1(int a[], int b[]) {// to print array we use void
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            s.add(a[i]);
        }
        int res = 0;
        for (int j = 0; j < b.length; j++) {
            if (s.contains(b[j])) {
                res++;
                s.remove(b[j]);
            }
        }
        /*
         * for(int i=0;i<a.length;i++){
         * if(s.contains(a[i])){
         * sout(b[i]);
         * }
         * }
         */
        return res;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 1 };
        int b[] = { 2, 3, 4, 5, 6 };
        System.out.println(intersection(a, b));
        System.out.println(intersection1(a, b));
    }
}
