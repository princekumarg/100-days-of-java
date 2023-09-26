package Tree;

public class TreeToLL {
    static Node prev = null;

    public static Node BTOLL(Node root) {
        if (root == null) {
            return root;
        }
        Node head = BTOLL(root.left);
        if (prev == null) {
            head = root;
        } else {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        BTOLL(root.right);
        return head;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        Node head = BTOLL(root);
        while (head != null) {
            System.out.println(head.key + " ");
            head = head.right;
        }
    }
}
