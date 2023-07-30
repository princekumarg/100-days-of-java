package Linked_list;

import java.util.HashSet;

public class DetectLoop {
    public static boolean detectloop(Node head) {
        Node temp = new Node(10);
        Node curr = head;
        while (curr != null) {
            if (curr.next == null) {
                return false;
            }
            if (curr.next == temp) {
                return true;
            }
            Node curr_next = curr.next;
            curr.next = temp;
            curr = curr_next;
        }
        return false;
    }

    public static boolean detectloop2(Node head) {
        HashSet<Node> s = new HashSet<Node>();
        for (Node curr = head; curr != null; curr = curr.next) {
            if (s.contains(curr))
                return true;
        }
        return false;
    }

    public static boolean detectloop3(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head.next;
        System.out.println(detectloop(head));
        System.out.println(detectloop2(head));
        System.out.println(detectloop3(head));
    }
}
