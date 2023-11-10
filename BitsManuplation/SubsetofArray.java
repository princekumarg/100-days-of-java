package BitsManuplation;

import java.util.ArrayList;
import java.util.List;

public class SubsetofArray {
    public static List<List<Integer>> subset(int arr[]) {
        List<List<Integer>> ls = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < (1 << n); i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                l.add(arr[j]);
            }
            ls.add(l);
        }
        return ls;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        List<List<Integer>> ls = subset(arr);
        System.out.println(ls);
    }
}
