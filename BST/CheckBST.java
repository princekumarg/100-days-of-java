package BST;

public class CheckBST {
    public static boolean isbst(NodeLL root, int min, int max) {
        if (root == null) {
            return true;
        }
        return ((root.key > min) && root.key < max && isbst(root.left, min, root.key)
                && isbst(root.right, root.key, max));
    }

    public static void main(String[] args) {
        NodeLL root = new NodeLL(20);
        root.left = new NodeLL(10);
        root.right = new NodeLL(30);
        root.right.left = new NodeLL(25);
        root.right.right = new NodeLL(35);
        root.right.left.left = new NodeLL(22);
        root.right.left.right = new NodeLL(28);
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        System.out.println(isbst(root, min, max));
    }
}
