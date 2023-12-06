package Linked_list;

public class MergeSort {
    public static Node merge(Node right, Node left) {
        Node temp = new Node(-1);
        Node res = temp;
        while (right != null && left != null) {
            if (right.data < left.data) {
                temp.next = right;
                right = right.next;
            } else {
                temp.next = left;
                left = left.next;
            }
        }
        if (right == null) {
            temp.next = left;
        } else {
            temp.next = right;
        }
        return res.next;
    }

    public static Node mergesort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node newhead = slow.next;
        slow.next = null;
        Node left = mergesort(head);
        Node right = mergesort(newhead);
        return merge(left, right);
    }

    public static Node sortList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        return mergesort(head);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(20);
        head.next.next.next = new Node(25);
        System.out.println(mergesort(head));

    }

}
