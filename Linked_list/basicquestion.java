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
        Node fast = head;
        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return 1;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return 0;
    }

    public static Node circularNode(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        if (fast == null && fast.next == null) {
            return null;
        }
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return head;
    }

    public static Node getNode(Node head, int k) {
        for (int i = 1; i < k && head != null; i++) {
            head = head.next;
        }
        return head;
    }

    public static Node newNode(int data) {
        Node newnode = new Node(data);
        return newnode;
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

    public static Node deleteMiddle(Node head) {
        if (head.next == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        Node temp = head;
        while (fast != null && fast.next != null) {
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        temp.next = slow.next;
        return head;
    }

    public static Node deleteNthNode(Node head, int n) {
        Node first = new Node(0);
        first.next = head;
        Node slow = first;
        Node fast = first;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return first.next;
    }

    public static int findlength(Node slow, Node fast) {
        int count = 0;
        fast = fast.next;
        while (slow != fast) {
            count++;
            fast = fast.next;
        }
        return count;
    }

    public static int looplength(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return findlength(slow, fast);
            }
        }
        return 0;
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

    public static Node pluseone(Node head) {
        while (head != null && head.data == 0) {
            head = head.next;
        }
        head = reverse(head);
        Node temp = head;
        int carry = 1;
        Node prev = head;
        while (temp != null) {
            int sum = temp.data + carry;
            carry = sum / 10;
            sum = sum % 10;
            head.data = sum;
            prev = head;
            head = head.next;
        }
        if (carry != 0) {
            Node newNode = new Node(carry);
            newNode.data = carry;
            if (prev != null) {
                prev.next = newNode;
            } else {
                return newNode;
            }
        }
        Node ans = reverse(temp);
        return ans;
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

    public static Node MergesortList(Node list1, Node list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        Node temp;
        if (list1.data < list2.data) {
            temp = new Node(list1.data);
            temp.next = MergesortList(list1.next, list2);
        } else {
            temp = new Node(list2.data);
            temp.next = MergesortList(list1, list2.next);
        }
        return temp;
    }

    public static Node removeduplicate(Node head) {
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

    public static Node unionlist(Node head1, Node head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        Node temp;
        if (head1.data < head2.data) {
            temp = new Node(head1.data);
            temp.next = unionlist(head1.next, head2);
        } else {
            temp = new Node(head2.data);
            temp.next = unionlist(head1, head2.next);
        }
        Node curr = temp;
        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return temp;
    }

    public static Node intersection(Node head1, Node head2) {
        if (head1 == null || head2 == null) {
            return null;
        }
        Node temp1 = head1;
        Node temp2 = head2;
        while (temp1 != temp2) {
            temp1 = temp1 == null ? head2 : temp1.next;
            temp2 = temp2 == null ? head1 : temp2.next;
        }
        return temp1;
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

    public static void DeltetNode(Node head) {
        head.data = head.next.data;
        head.next = head.next.next;
    }

    public static Node sortingLL(Node head) {
        Node curr = head;
        Node prev = head;
        while (curr != null) {
            prev = curr;
            curr = curr.next;
            if (prev.data > curr.data) {
                int temp = prev.data;
                prev.data = curr.data;
                curr.data = temp;
            }
        }
        return head;
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
