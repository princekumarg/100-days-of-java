package Linked_list;

public class InsertinPointINLL {
    public static Node intersectionnode(Node head1, Node head2) {
        while (head2 != null) {
            Node temp = head1;
            while (temp != null) {
                // if both Nodes are same
                if (temp == head2) {
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        // If intersection is not present between the lists,
        // return NULL.
        return null;
    }

    // getInsertion point of two linkednlist
    /*
     * function to get the intersection point of two linked
     * lists head1 and head2
     */
    public static int getNode(Node head1, Node head2) {
        int c1 = getCount(head1);
        int c2 = getCount(head2);
        int d;

        if (c1 > c2) {
            d = c1 - c2;
            return _getIntesectionNode(d, head1, head2);
        } else {
            d = c2 - c1;
            return _getIntesectionNode(d, head2, head1);
        }
    }

    /*
     * function to get the intersection point of two linked
     * lists head1 and head2 where head1 has d more nodes than
     * head2
     */
    public static int _getIntesectionNode(int d, Node head1, Node head2) {
        int i;
        Node current1 = head1;
        Node current2 = head2;
        for (i = 0; i < d; i++) {
            if (current1 == null) {
                return -1;
            }
            current1 = current1.next;
        }
        while (current1 != null && current2 != null) {
            if (current1.data == current2.data) {
                return current1.data;
            }
            current1 = current1.next;
            current2 = current2.next;
        }

        return -1;
    }

    /*
     * Takes head pointer of the linked list and
     * returns the count of nodes in the list
     */
    public static int getCount(Node node) {
        Node current = node;
        int count = 0;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        Node head2 = new Node(5);
        head2.next = new Node(6);
        head2.next.next = new Node(7);
        head2.next.next.next = head1.next.next.next;
        System.out.println("The node of intersection is " + getNode(head1, head2));
        Node pri = intersectionnode(head1, head2);
        System.out.println(pri.data + " " + pri.next.data + " " + pri.next.next.data + " " + pri.next.next.next.data
                + " " + pri.next.next.next.next.data + " " + pri.next.next.next.next.next.data + " "
                + pri.next.next.next.next.next.next.data + " " + pri.next.next.next.next.next.next.next.data);

    }
}
