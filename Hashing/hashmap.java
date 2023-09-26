package Hashing;

import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "India");
        hm.put(2, "prince");
        hm.put(3, "G7");
        if (hm.containsKey(2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        hm.remove(1);
        System.out.println(hm.size());
    }
}
