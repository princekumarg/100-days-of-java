package BST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class vertical_order_trasversal {
    public static void verticalorder(NodeLL root) {
        Queue<PairClass> q = new LinkedList<PairClass>();
        Map<Integer, ArrayList<Integer>> mp = new TreeMap<>();
        q.add(new PairClass(root, 0));
        while (!q.isEmpty()) {
            PairClass p = q.poll();
            NodeLL curr = p.node;
            int hd = p.hd;
            if (mp.containsKey(hd)) {
                mp.get(hd).add(curr.key);
            } else {
                ArrayList<Integer> al = new ArrayList<Integer>();
                al.add(curr.key);
                mp.put(hd, al);
            }
            if (curr.left != null) {
                q.add(new PairClass(curr.left, hd));
            }
            if (curr.right != null) {
                q.add(new PairClass(curr.right, hd));
            }
        }
        for (Map.Entry<Integer, ArrayList<Integer>> p : mp.entrySet()) {
            ArrayList<Integer> al = p.getValue();
            for (int x : al) {
                System.out.println(x + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NodeLL root = new NodeLL(20);
        root.left = new NodeLL(10);
        root.right = new NodeLL(30);
        root.right.left = new NodeLL(25);
        root.right.right = new NodeLL(35);
        root.right.left.left = new NodeLL(22);
        root.right.left.right = new NodeLL(28);
        verticalorder(root);
    }
}
