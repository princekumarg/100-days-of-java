package Linked_list;

public class SegregateOddAndEven {
    public static Node segregate(Node head) {
        Node es = null, ee = null, os = null, oe = null;
        for (Node curr = head; curr != null; curr = curr.next) {
            int x = curr.data;
            if (x % 2 == 0) {
                if (es == null) {
                    es = curr;
                    ee = es;
                } else {
                    ee.next = curr;
                    ee = ee.next;
                }
            } else {
                if (os == null) {
                    os = curr;
                    oe = os;
                } else {
                    oe.next = curr;
                    oe = ee.next;
                }
            }
        }
        if (os == null || es == null) {
            return head;
        }
        ee.next = os;
        oe.next = null;
        return es;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        Node pri = segregate(head);
        System.out.println(pri.data + " " + pri.next.data + " " + pri.next.next.data + " " + pri.next.next.next.data);
    }
}
