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

    public static int maxelement(Node head) {
        int max = Integer.MIN_VALUE;
        Node temp = head;
        while (temp != null) {
            if (temp.data > max) {
                max = temp.data;
            }
            temp = temp.next;
        }
        return max;
    }

    public static int checkcircleLL(Node head) {
        if (head == null || head.next == null) {
            return 0;
        }
        Node slow = head;
        Node fast = head.next.next;
        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return 1;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return 0;
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

    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertbegin(head, 10);
        head = insertbegin(head, 20);
        head = insertend(head, 31);
        head = insertend(head, 41);
        System.out.println(counteven(head));
        printLL(head);
    }
}
