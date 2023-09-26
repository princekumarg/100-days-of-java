package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintleftViewTree {
    static int maxlevel = 0;

    public static void printleft(Node root, int level) {
        if (root == null) {
            return;
        }
        if (maxlevel < level) {
            System.out.print(root.key + " ");
            maxlevel = level;
        }
        printleft(root.left, level + 1);
        printleft(root.right, level + 1);
    }

    public static void printleftview(Node root) {
        printleft(root, 1);
    }

    public static void printsleft(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (q.isEmpty() == false) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                Node curr = q.poll();
                if (i == 0) {
                    System.out.print(curr.key + " ");
                }
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        printleftview(root);
        System.out.println();
        printleft(root, maxlevel);
        System.out.println();
        printsleft(root);
    }
}
