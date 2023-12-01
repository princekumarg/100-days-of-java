package Linked_list;

public class basicquestion {
    public static int counteven(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data % 2 == 0) {
                count++;
            }
            temp = temp.next;
        }
        return count;
    }

    public static Node insertbegin(Node head, int x) {
        Node newnode = new Node(x);
        if (head == null) {
            return newnode;
        }
        newnode.next = head;
        head = newnode;
        return head;
    }

    public static Node insertend(Node head, int x) {
        Node newnode = new Node(x);
        if (head == null) {
            return newnode;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertbegin(head, 10);
        head = insertbegin(head, 20);
        head = insertend(head, 31);
        head = insertend(head, 41);
        System.out.println(counteven(head));
    }
}
