package Linked_list;

public class ReverseK {
    public static Node reverse1(Node head, int k) {
        Node curr = head, next = null, prev = null;
        int count = 0;
        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if (next != null) {
            Node rest_head = reverse1(next, k);
            head.next = rest_head;
        }
        return prev;
    }

    public static Node reverse2(Node head, int k) {
        Node curr = head, prevFirst = null;
        boolean isFirstPass = true;
        while (curr != null) {
            Node first = curr, prev = null;
            int count = 0;
            while (curr != null && count < k) {
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count++;
            }
            if (isFirstPass) {
                head = prev;
                isFirstPass = false;
            } else {
                prevFirst.next = prev;
            }
            prevFirst = first;
        }
        return head;
    }

    public static void printlist(Node head) {// iterative method
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        System.out.println("Before Reverse");
        printlist(head);
        System.out.println("\nAfter reverse1");
        head = reverse1(head, 2);
        printlist(head);
        System.out.println("\nAfter reverse2");
        head = reverse2(head, 2);
        printlist(head);
    }
}
