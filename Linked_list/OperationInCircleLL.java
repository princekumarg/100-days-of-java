package Linked_list;

public class OperationInCircleLL {
    public static void printlist(CircleLLNode head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        for (CircleLLNode r = head.next; r != head; r = r.next) {
            System.out.print(r.data + " ");
        }
    }

    public static CircleLLNode insertBegin(CircleLLNode head, int x) {
        CircleLLNode temp = new CircleLLNode(x);
        if (head == null) {
            temp.next = temp;
        } else {
            CircleLLNode curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = temp;
            temp.next = head;
        }
        return temp;
    }

    public static CircleLLNode insertEnd(CircleLLNode head, int x) {
        CircleLLNode temp = new CircleLLNode(x);
        if (head == null) {
            temp.next = temp;
            return temp;
        } else {
            temp.next = head.next;
            head.next = temp;
            int t = temp.data;
            temp.data = head.data;
            head.data = t;
            return temp;
        }
    }

    public static CircleLLNode deleteHead(CircleLLNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == head) {
            return null;
        }
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }

    public static CircleLLNode deleteKTH(CircleLLNode head, int k) {
        if (head == null) {
            return null;
        }
        if (k == 1) {
            return deleteHead(head);
        }
        CircleLLNode curr = head;
        for (int i = 0; i < k - 2; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }

    public static void main(String[] args) {
        CircleLLNode head = new CircleLLNode(10);
        head.next = new CircleLLNode(20);
        head.next.next = new CircleLLNode(30);
        head.next.next.next = new CircleLLNode(40);
        head.next.next.next.next = head;
        printlist(head);
    }
}
