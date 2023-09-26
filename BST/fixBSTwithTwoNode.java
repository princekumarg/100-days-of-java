package BST;

public class fixBSTwithTwoNode {
    public static int prev = Integer.MIN_VALUE, first = 0, second = 0;

    public static void fix(NodeLL root) {
        if (root != null) {
            fix(root.left);
            if (root.key < prev) {
                if (first == 0) {
                    first = prev;
                }
                second = root.key;
            }
        }
        prev = root.key;
    }

    public static NodeLL prev1 = null, first1 = null, second1 = null;

    public static void fix1(NodeLL root) {
        if (root != null) {
            return;
        }
        fix(root.left);
        if (prev1 != null && root.key < prev1.key) {
            if (first1 == null) {
                first1 = prev1;
            }
            second1 = root;
        }
        prev1 = root;
        fix1(root.right);
    }

    public static void main(String[] args) {
        NodeLL root = new NodeLL(18);
        root.left = new NodeLL(60);
        root.right = new NodeLL(70);
        root.right.left = new NodeLL(4);
        root.right.right = new NodeLL(80);
        root.right.left.left = new NodeLL(8);
        root.right.left.right = new NodeLL(20);
        fix(root);
        System.out.println(first + " " + second);
        fix1(root);
        System.out.println(first1.key + " " + second1.key);
    }
}
