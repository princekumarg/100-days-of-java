package Linked_list;

public class reversekthsize {
    public static Node reverse(Node head) {
        Node curr = head;
        Node prev = null;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static Node getNode(Node head, int k) {
        for (int i = 1; i < k && head != null; i++) {
            head = head.next;
        }
        return head;
    }

    public static Node reversekgroup(Node head, int k) {
        Node temp = head;
        Node prev = null;// prevlast
        Node checkNode = getNode(temp, k);
        if (checkNode == null) {
            return head;
        }
        while (temp != null) {
            Node kthNode = getNode(temp, k);
            if (kthNode == null) {
                if (prev != null) {
                    prev.next = temp;
                }
                break;
            }
            Node nextnode = kthNode.next;
            kthNode.next = null;
            reverse(temp);
            if (temp == head) {
                head = kthNode;
            } else {
                prev.next = kthNode;
            }
            prev = temp;
            temp = nextnode;
        }
        return head;
    }

    public static void printll(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printll(head);
        System.out.println();
        head = reversekgroup(head, 3);
    }
}
