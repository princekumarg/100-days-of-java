package Stack;

public class Mystack {
    public static StackNode head;
    public static int size;

    public Mystack() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void push(int d) {
        StackNode temp = new StackNode(d);
        temp.next = head;
        head = temp;
        size++;
    }

    public static int pop() {
        if (head == null) {
            return Integer.MAX_VALUE;
        }
        int res = head.data;
        head = head.next;
        size--;
        return res;
    }

    public static int peek() {
        if (head == null) {
            return Integer.MAX_VALUE;
        }
        return head.data;
    }
}
