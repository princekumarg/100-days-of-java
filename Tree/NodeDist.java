package Tree;

public class NodeDist {
    public static void printkdist(Node root, int k) {
        if (root == null || k < 0) {
            return;
        }
        if (k == 0) {
            System.out.print(root.key + " ");
            System.out.println(" ");
            return;
        }
        printkdist(root.left, k - 1);
        printkdist(root.right, k - 1);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);
        printkdist(root, 1);
    }
}
