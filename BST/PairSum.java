package BST;

import java.util.HashSet;

public class PairSum {
    public static boolean find(NodeLL root, int sum, HashSet<Integer> hs) {
        if (root == null) {
            return false;
        }
        if (find(root.left, sum, hs) == true) {
            return true;
        }
        if (hs.contains(sum - root.key)) {
            return true;
        } else {
            hs.add(root.key);
        }
        return find(root.right, sum, hs);
    }

    public static void main(String[] args) {
        NodeLL root = new NodeLL(20);
        root.left = new NodeLL(10);
        root.right = new NodeLL(30);
        root.right.left = new NodeLL(25);
        root.right.right = new NodeLL(35);
        root.right.left.left = new NodeLL(22);
        root.right.left.right = new NodeLL(28);
        int sum = 50;
        HashSet<Integer> hs = new HashSet<>();
        System.out.println(find(root, sum, hs));
    }
}
