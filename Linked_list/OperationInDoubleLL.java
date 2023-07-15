package Linked_list;

public class OperationInDoubleLL {
    public static DoubleLLNode insertBegin(DoubleLLNode head, int data) {
        DoubleLLNode temp = new DoubleLLNode(data);
        temp.next = head;
        if (head != null) {
            head.prev = temp;
        }
        return temp;
    }

    public static DoubleLLNode insertEnd(DoubleLLNode head, int data) {
        DoubleLLNode temp = new DoubleLLNode(data);
        if (head == null) {
            return temp;
        }
        DoubleLLNode curr = head;
        temp.next = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
        return head;
    }

    public static DoubleLLNode Reverse(DoubleLLNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        DoubleLLNode curr = head;
        DoubleLLNode prev = null;
        while (curr != null) {
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.prev;
        }
        return prev.prev;
    }

    public static DoubleLLNode deleteHead(DoubleLLNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        } else {
            head = head.next;
            head.prev = null;
            return head;
        }
    }

    public static DoubleLLNode deleteEnd(DoubleLLNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        DoubleLLNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.prev.next = null;
        return head;
    }

    public static void main(String[] args) {
        DoubleLLNode head = new DoubleLLNode(10);
        DoubleLLNode temp1 = new DoubleLLNode(20);
        DoubleLLNode temp2 = new DoubleLLNode(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        System.out.println(head.data + " " + head.next.data + " " + head.next.next.data);
    }
}
