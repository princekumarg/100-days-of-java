package Linked_list;

public class PrintNthFromEnd {
    public static void printFromEnd(Node head, int n) {
        if (head == null) {
            return;
        }
        Node first = head;
        for (int i = 0; i < n; i++) {
            if (first == null) {
                return;
            }
            first = first.next;
        }
        Node second = head;
        while (first != null) {
            second = second.next;
            first = first.next;
        }
        System.out.print(second.data + " ");
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        System.out.println("Before Insertion");
        printFromEnd(head, 2);
    }
}
