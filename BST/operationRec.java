package BST;

public class operationRec {
    public boolean search(NodeLL root, int x) {
        if (root == null) {
            return false;
        } else if (root.key == x) {
            return true;
        } else if (root.key < x) {
            return search(root.right, x);
        } else {
            return search(root.left, x);
        }
    }

    public NodeLL insert(NodeLL root, int x) {
        if (root == null) {
            return new NodeLL(x);
        } else if (root.key > x) {
            root.left = insert(root.left, x);
        } else {
            root.right = insert(root.right, x);
        }
        return root;
    }

    public NodeLL delNode(NodeLL root, int x) {
        if (root == null) {
            return null;
        }
        if (root.key > x) {
            root.left = delNode(root.right, x);
        } else if (root.key < x) {
            root.right = delNode(root.right, x);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                NodeLL succ = getsucc(root);
                root.key = succ.key;
                root.right = delNode(root.right, succ.key);
            }

        }
        return root;
    }

    public NodeLL getsucc(NodeLL root) {
        NodeLL curr = root.right;
        while (curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }

    public NodeLL floor(NodeLL root, int x) {
        NodeLL res = null;
        while (root != null) {
            if (root.key == x) {
                return root;
            } else if (root.key > x) {
                root = root.left;
            } else {
                res = root;
                root = root.right;
            }
        }
        return res;
    }

    public NodeLL ceil(NodeLL root, int x) {
        NodeLL res = null;
        while (root != null) {
            if (root.key == x) {
                return root;
            } else if (root.key > x) {
                res = root;
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        NodeLL root = null;
        operationRec op = new operationRec();
        root = op.insert(root, 10);
        root = op.insert(root, 20);
        root = op.insert(root, 30);
        root = op.insert(root, 40);
        root = op.insert(root, 50);
        root = op.insert(root, 60);
        root = op.insert(root, 70);
        root = op.insert(root, 80);
        System.out.println(op.search(root, 30));
        System.out.println(op.delNode(root, 30).key);
        System.out.println(op.floor(root, 15).key);
        System.out.println(op.ceil(root, 15).key);
    }

}
