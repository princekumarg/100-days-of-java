package Linked_list;

public class SegregateOddAndEven {
    public static Node segregate(Node head) {
        Node dummy_odd = new Node(-1);
        Node dummy_even = new Node(-1);
        Node odd = dummy_odd;
        Node even = dummy_even;
        int index = 0;
        Node curr = head;
        while (curr != null) {
            index++;
            if (index % 2 == 0) {
                even.next = curr;
                even = even.next;
            } else {
                odd.next = curr;
                odd = odd.next;
            }
            curr = curr.next;
        }
        even.next = null;
        odd.next = dummy_even.next;
        return dummy_odd.next;
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
