package Linked_list;

public class DeletionList {
    public static Node delNodestart(Node head) {
        if (head == null) {
            return null;
        } else {
            return head.next;
        }
    }

    public static Node delNodeend(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }

    public Node removeNthFromEnd(Node head, int n) {// leetcode
        Node curr = head;
        Node prev = null;
        Node start = null;
        while (curr != null) {
            n = n - 1;
            curr = curr.next;
            if (n <= 0) {
                if (start == null) {
                    start = head;
                } else {
                    prev = start;
                    start = start.next;
                }
            }
        }
        if (prev == null) {
            return start.next;
        }
        prev.next = start.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head = delNodestart(head);
        System.out.println(head.data + " " + head.next.data);
        head = delNodeend(head);
        System.out.println(head.data);
    }
}
