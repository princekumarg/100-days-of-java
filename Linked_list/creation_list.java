package Linked_list;

public class creation_list {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printlist(head);
        System.out.println();
        rprint(head);
    }

    public static void printlist(Node head) {// iterative method
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void rprint(Node head) {// Recursive methode
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        rprint(head.next);
    }
}
