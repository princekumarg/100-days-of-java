package Linked_list;

public class searchlist {
    public static int search(Node head, int x) {// itrative
        int pos = 1;
        Node curr = head;
        while (curr != null) {
            if (curr.data == x) {
                return pos;
            } else {
                pos++;
                curr = curr.next;
            }
        }
        return -1;
    }

    public static int search1(Node head, int x) {// recursive
        if (head == null) {
            return -1;
        }
        if (head.data == x) {
            return 1;
        } else {
            int res = search1(head.next, x);
            if (res == -1) {
                return -1;
            } else {
                return res + 1;
            }
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        System.out.println(search(head, 20));
        System.out.println(search1(head, 30));
    }
}
