package BST;

import java.util.TreeSet;

import java.util.Iterator;

public class treeset {
    public static void main(String[] args) {
        TreeSet<String> s = new TreeSet<>();
        s.add("prince");
        s.add("CSE");
        s.add("4TH");
        System.out.println(s);
        System.out.println(s.contains("CSE"));
        // Iterator<String> i=s.iterator();
        Iterator<String> i = s.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        TreeSet<Integer> p = new TreeSet<>();
        p.add(10);
        p.add(20);
        p.add(30);
        p.add(40);
        p.remove(10);
        for (Integer x : p) {
            System.out.println(x + " ");
        }
        System.out.println(p.lower(25));
        System.out.println(p.higher(15));
        System.out.println(p.floor(15));
        System.out.println(p.ceiling(30));

    }
    // these are the function of treeset
    // add(),contains(),remove(),floor(),ceiling(),higher(),lower(),size(),isEmpty()
    // timecomplexity:0(n)
}
