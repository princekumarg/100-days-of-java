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

    public static Node middleelmArray(Node head) {
        if (head == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static int binaryNode(Node head) {
        int ans = 0;
        Node temp = head;
        while (temp != null) {
            ans = ans * 2 + temp.data;
            temp = temp.next;
        }
        return ans;
    }

    public static int[] sumpro(Node head) {
        int sum = 0;
        int pro = 1;
        Node temp = head;
        while (temp != null) {
            sum = sum + temp.data;
            pro = pro * temp.data;
            temp = temp.next;
        }
        return new int[] { sum, pro };
    }

    public static Node reverse(Node head) {
        Node curr = head;
        Node prev = null;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static boolean ispalindrom(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node rev = reverse(slow);
        while (rev != null && head != null) {
            if (rev.data != head.data) {
                return false;
            }
            rev = rev.next;
            head = head.next;
        }
        return true;
    }

    public static void printaltrnative(Node head) {
        if (head == null || head.next == null) {
            return;
        }
        Node temp = head;
        while (temp != null && temp.next != null) {
            temp.next = temp.next.next;
            temp = temp.next;
        }
    }

    public static boolean searchrec(Node head, int temp) {
        if (head == null) {
            return false;
        }
        if (head.data == temp) {
            return true;
        }
        return searchrec(head.next, temp);
    }

    public static boolean serachitr(Node head, int x) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == x) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static int findelem(Node head, int index) {
        Node temp = head;
        int count = 0;// if index starts from 0 else count=1 for index start from 1
        while (temp != null) {
            if (count == index) {
                return temp.data;
            }
            count++;
            temp = temp.next;
        }
        return -1;
    }

    public static boolean identicalLL(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        while (temp1 != null && temp2 != null) {
            if (temp1.data != temp2.data) {
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;
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

    public static void DetectNode(Node head) {
        head.data = head.next.data;
        head.next = head.next.next;
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
