package BST;

import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {
        TreeMap<Integer, String> t = new TreeMap<>();
        t.put(10, "geeks");
        t.put(15, "ide");
        t.put(5, "coursera");
        System.out.println(t);
        System.out.println(t.containsKey(10));
        t.remove(10);
        System.out.println(t.size());
    }
    // function used
    // put(),remove(),containsKey(),floorkey(),ceilingkey(),higherkey(),lowerkey():0(n)
    // function used size(),isEmpty();
}
