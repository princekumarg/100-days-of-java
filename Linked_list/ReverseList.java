package Linked_list;

import java.util.ArrayList;

public class ReverseList {
    public static Node revList(Node head) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (Node curr = head; curr != null; curr = curr.next) {
            arr.add(curr.data);
        }
        for (Node curr = head; curr != null; curr = curr.next) {
            curr.data = arr.remove(arr.size() - 1);
        }
        return head;
    }

    public static Node revList2(Node head) {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static Node revlist3(Node head) {// recursive approach
        if (head == null || head.next == null) {
            return head;
        }
        Node rest_head = revlist3(head.next);
        Node rest_tail = head.next;
        rest_tail.next = head;
        head.next = null;
        return rest_head;
    }

    public static Node revlist4(Node curr, Node prev) {
        if (curr == null) {
            return prev;
        }
        Node next = curr.next;
        curr.next = prev;
        return revlist4(next, curr);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head = revList(head);
        System.out.print(head.data + " " + head.next.data + " " + head.next.next.data);
        System.out.println();
        head = revList2(head);
        System.out.print(head.data + " " + head.next.data + " " + head.next.next.data);
        System.out.println();
        head = revlist3(head);
        System.out.print(head.data + " " + head.next.data + " " + head.next.next.data);
        System.out.println();
        System.out.println(revlist4(head, null).data);

    }
}
