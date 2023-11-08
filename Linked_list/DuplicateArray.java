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

    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
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
    }
}
