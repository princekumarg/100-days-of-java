package Linked_list;

public class Insertion {
    public static Node head;
    public static Node tail;

    public static void printlist() {// iterative method
        if (head == null) {
            System.out.println("empty list");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void insertbeging(int x) {
        Node temp = new Node(x);
        if (head == null) {
            head = tail = new Node(x);
            return;
        }
        temp.next = head;
        head = temp;
    }

    public static void insertend(int x) {
        Node temp = new Node(x);
        if (head == null) {
            head = tail = temp;// always rember that head=tail=temp
            return;
        }
        tail.next = temp;
        tail = temp;
    }

    public static Node insertPos(Node head, int pos, int data) {// insertion at a given postion
        Node temp = new Node(data);
        if (pos == 1) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for (int i = 1; i < pos - 2 && curr != null; i++) {
            curr = curr.next;
        }
        if (curr == null) {
            return head;
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

    public static void main(String args[]) {
        insertbeging(10);
        insertbeging(20);
        insertbeging(30);
        insertbeging(40);
        insertend(50);
        printlist();
        head = insertPos(head, 3, 100);
        printlist();
    }
}
