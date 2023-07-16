package Linked_list;

public class SortTheList {
    public static Node sortedInsert(Node head, int x) {
        Node temp = new Node(x);
        if (head == null) {
            return temp;
        }
        if (x < head.data) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        while (curr.next != null && curr.next.data < x) {
            curr = curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;
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
        Node head = new Node(20);
        head.next = new Node(30);
        head.next.next = new Node(40);
        System.out.println("before Insertion");
        printlist(head);
        System.out.println();
        System.out.println("After Insertion");
        head = sortedInsert(head, 25);
        printlist(head);
    }
}
