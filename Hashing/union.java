package Hashing;

import java.util.HashSet;

public class union {
    public static void Union(int a[], int b[]) {
        int c[] = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }
        for (int i = 0; i < a.length + b.length; i++) {
            if (i == 0 || c[i] != c[i - 1]) {
                System.out.print(c[i] + " ");
            }
        }
    }

    public static int findUnion(int a[], int b[]) {
        int c[] = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }
        int res = 0;
        for (int i = 0; i < a.length + b.length; i++) {
            boolean flag = false;
            for (int j = 0; j < i - 1; j++) {
                if (c[i] == c[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                res++;
            }
        }
        return res;
    }

    public static int findUnion1(int a[], int b[]) {
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            s.add(a[i]);
        }
        for (int j = 0; j < b.length; j++) {
            s.add(b[j]);
        }
        return s.size();
    }

    public static void findUnion2(int a[], int b[]) {
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            s.add(a[i]);
        }
        for (int j = 0; j < b.length; j++) {
            s.add(b[j]);
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = { 2, 3, 4, 5, 6 };
        Union(a, b);
        System.out.println(findUnion(a, b));
        System.out.println(findUnion1(a, b));
        findUnion2(a, b);
    }

}
