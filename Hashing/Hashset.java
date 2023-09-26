package Hashing;

import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();
        h.add("India");
        h.add("Prince");
        h.add("G7");
        System.out.println(h);
        System.out.println(h.contains("India"));
        h.remove("India");
        System.out.println(h);
        Iterator<String> i = h.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
    }
}
