package BST;

public class operationIterative {
    public boolean search(NodeLL root, int x) {
        while (root != null) {
            if (root.key == x) {
                return true;
            } else if (root.key < x) {
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return false;
    }

    public NodeLL insert(NodeLL root, int x) {
        NodeLL temp = new NodeLL(x);
        NodeLL prent = null, curr = root;
        while (curr != null) {
            prent = curr;
            if (curr.key > x) {
                curr = curr.left;
            } else if (curr.key < x) {
                curr = curr.right;
            } else {
                return root;
            }
        }
        if (prent == null) {
            return temp;
        }
        if (prent.key > x) {
            prent.left = temp;
        } else {
            prent.right = temp;
        }
        return root;
    }
}
