package Linked_list;

public class findthekth {
    public static Node kthlast(Node head, int k) {
        int cnt = 1;
        Node temp = head;
        while (temp != null) {
            if (cnt == k) {
                return temp;
            }
            cnt++;
            temp = temp.next;
        }
        return temp;
    }

    public static Node rotateright(Node head, int k) {
        if (head == null || k == 0)
            return head;
        Node temp = head;
        int cnt = 1;
        while (temp.next != null) {
            cnt++;
            temp = temp.next;
        }
        if (k % cnt == 0)
            return head;
        k = k % cnt;
        temp.next = head;
        Node kth = kthlast(head, cnt - k);
        head = kth.next;
        kth.next = null;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

    }
}
