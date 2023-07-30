package Linked_list;

import java.util.ArrayDeque;
import java.util.Deque;

public class palindromLL {
    public static boolean isPalindrom(Node head) {
        if (head == null)
            return true;
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node rev = reverseList(slow.next);
        Node curr = head;
        while (rev != null) {
            if (rev.data != curr.data) {
                return false;
            }
            rev = rev.next;
            curr = curr.next;
        }
        return true;
    }

    public static Node reverseList(Node head) {// recursive approach
        if (head == null || head.next == null) {
            return head;
        }
        Node rest_head = reverseList(head.next);
        Node rest_tail = head.next;
        rest_tail.next = head;
        head.next = null;
        return rest_head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
    }
}
