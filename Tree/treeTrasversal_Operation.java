package Tree;

public class treeTrasversal_Operation {
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    public void preorder(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key + " ");
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(height(root.left), height(root.right));
        }
    }

    public static int getsize(Node root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + getsize(root.left) + getsize(root.right);
        }
    }

    public static int getMax(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        } else {
            return Math.max(root.key, Math.max(getMax(root.left), getMax(root.right)));
        }
    }

    public static boolean isBalanced(Node root) {// 0(n^2)
        if (root == null) {
            return true;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return (Math.abs(lh - rh) <= 1 && isBalanced(root.left) && isBalanced(root.right));
    }

    public static int isBalances2(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = isBalances2(root.left);
        if (lh == -1) {
            return -1;
        }
        int rh = isBalances2(root.right);
        if (rh == -1) {
            return -1;
        }
        if (Math.abs(lh - rh) > 1)
            return -1;
        else
            return Math.max(lh, rh) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        treeTrasversal_Operation t = new treeTrasversal_Operation();
        t.inorder(root);
        System.out.println();
        t.preorder(root);
        System.out.println();
        t.postorder(root);
        System.out.println();
        System.out.println(height(root.right));
        System.out.println(getsize(root));
        System.out.println(getMax(root));
        System.out.println(isBalanced(root));
        System.out.println(isBalances2(root));
    }
}
