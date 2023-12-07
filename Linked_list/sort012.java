package Linked_list;

public class sort012 {
    public static Node sort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        int count0 = 0, count1 = 0, count2 = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == 0) {
                count0++;
            } else if (temp.data == 1) {
                count1++;
            } else {
                count2++;
            }
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (count0 != 0) {
                temp.data = 0;
                count0--;
            } else if (count1 != 0) {
                temp.data = 1;
                count1--;
            } else {
                temp.data = 2;
                count2--;
            }
            temp = temp.next;
        }
        return head;
    }

    public static Node sort2(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node zerohead = new Node(-1);
        Node onehead = new Node(-1);
        Node twohead = new Node(-1);
        Node zero = zerohead;
        Node one = onehead;
        Node two = twohead;
        Node temp = head;
        while (temp != null) {
            if (temp.data == 0) {
                zero.next = temp;
                zero = zero.next;
            } else if (temp.data == 1) {
                one.next = temp;
                one = one.next;
            } else {
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }
        zero.next = (onehead.next != null) ? onehead.next : twohead.next;
        one.next = twohead.next;
        two.next = null;
        Node newhead = zerohead.next;
        return newhead;
    }
}
