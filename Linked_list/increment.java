package Linked_list;

public class increment {
    public static void increment1(Node head) {
        while (head != null) {
            head.data++;
            head = head.next;
        }
    }

    public static void printlist(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.print("null");
    }

    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printlist(head);
        increment1(head);
        System.out.println();
        printlist(head);
    }
}
