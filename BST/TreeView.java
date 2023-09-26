package BST;

import java.util.Queue;
import java.util.TreeMap;

import java.util.LinkedList;
import java.util.Map;

public class TreeView {
    NodeLL root;

    public TreeView() {
        root = null;
    }

    public static void TopView(NodeLL root) {
        if (root == null) {
            return;
        }
        Queue<PairClass> q = new LinkedList<PairClass>();
        Map<Integer, NodeLL> mp = new TreeMap<Integer, NodeLL>();
        q.add(new PairClass(root, 0));
        while (!q.isEmpty()) {
            PairClass p = q.poll();
            if (!mp.containsKey(p.hd)) {
                mp.put(p.hd, p.node);
            }
            if (p.node.left != null) {
                q.add(new PairClass(p.node.left, p.hd - 1));
            }
            if (p.node.right != null) {
                q.add(new PairClass(p.node.right, p.hd + 1));
            }
        }
        for (Map.Entry<Integer, NodeLL> entry : mp.entrySet()) {
            System.out.println(entry.getValue().key + " ");
        }
    }

    public static void BottomView(NodeLL root) {
        if (root == null) {
            return;
        }
        Queue<PairClass> q = new LinkedList<>();
        Map<Integer, NodeLL> mp = new TreeMap<>();
        q.add(new PairClass(root, 0));
        while (!q.isEmpty()) {
            PairClass p = q.poll();
            mp.put(p.hd, p.node);
            if (p.node.left != null) {
                q.add(new PairClass(p.node.left, p.hd - 1));
            }
            if (p.node.right != null) {
                q.add(new PairClass(p.node.right, p.hd + 1));
            }

        }
        for (Map.Entry<Integer, NodeLL> entry : mp.entrySet()) {
            System.out.println(entry.getValue().key + " ");
        }
    }

    public static void main(String[] args) {
        TreeView tree = new TreeView();
        tree.root = new NodeLL(20);
        tree.root.left = new NodeLL(10);
        tree.root.right = new NodeLL(30);
        tree.root.right.left = new NodeLL(25);
        tree.root.right.right = new NodeLL(35);
        tree.root.right.left.right = new NodeLL(28);
        tree.root.right.left.right.left = new NodeLL(26);
        System.out.println("Top View");
        tree.TopView(tree.root);
        System.out.println("Bottom View");
        tree.BottomView(tree.root);
    }
}
