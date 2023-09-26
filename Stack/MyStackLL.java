package Stack;

public class MyStackLL {
    NodeLL head;
    int sz;

    MyStackLL() {
        head = null;
        sz = 0;
    }

    public int size() {
        return sz;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int x) {
        NodeLL temp = new NodeLL(x);
        temp.next = head;
        head = temp;
        sz++;
    }

    public int pop() {
        if (head == null) {
            return Integer.MIN_VALUE;
        }
        int res = head.data;
        head = head.next;
        sz--;
        return res;
    }

    public int peek() {
        if (head == null) {
            return Integer.MIN_VALUE;
        }
        return head.data;
    }
}
