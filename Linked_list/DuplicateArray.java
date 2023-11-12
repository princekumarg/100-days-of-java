package Linked_list;

public class DuplicateArray {
    public static Node removeduplicate(Node head) {
        Node curr = head;
        if (head == null) {
            return null;
        }
        while (curr.next != null) {
            if (curr.data != curr.next.data) {
                curr = curr.next;
            } else {
                curr.next = curr.next.next;
            }
        }
        return head;
    }

    public static Node removEvenNode(Node head) {
        Node curr = head;
        if (head == null) {
            return null;
        }
        while (curr.next != null) {
            if (curr.data % 2 == 0) {
                curr = curr.next;
            } else {
                curr.next = curr.next.next;
            }
        }
        return head;
    }

    public static Node removeNegNode(Node head) {
        Node curr = head;
        if (head == null) {
            return null;
        }
        while (curr.next != null) {
            if (curr.data < 0) {
                curr = curr.next;
            } else {
                curr.next = curr.next.next;
            }
        }
        return head;
    }

    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(20);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(40);
        head.next.next.next.next.next = new Node(40);
        head.next.next.next.next.next.next = new Node(50);
        head = removeduplicate(head);
        printlist(head);
        System.out.println();
        head = removEvenNode(head);
        printlist(head);
        System.out.println();
        head = removeNegNode(head);
        printlist(head);
    }
}
