package BST;

public class KthSmallest {
    static int count = 0;

    public static void kthsmall(NodeLL root, int k) {
        if (root != null) {
            kthsmall(root.left, k);
            count++;
            if (count == k) {
                System.out.println(root.key + " ");
                return;
            }
            kthsmall(root.right, k);
        }

    }

    public static void main(String[] args) {
        int k = 3;
        NodeLL root = new NodeLL(20);
        root.left = new NodeLL(10);
        root.right = new NodeLL(30);
        root.right.left = new NodeLL(25);
        root.right.right = new NodeLL(35);
        root.right.left.left = new NodeLL(22);
        root.right.left.right = new NodeLL(28);
        kthsmall(root, k);
    }
}
