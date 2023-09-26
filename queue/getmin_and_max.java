package queue;

import java.util.Deque;
import java.util.LinkedList;

public class getmin_and_max {
    Deque<Integer> dq;

    getmin_and_max() {
        dq = new LinkedList<>();
    }

    public void insertMin(int x) {
        dq.offerFirst(x);
    }

    public void insertmax(int x) {
        dq.offerLast(x);
    }

    public int getmin() {
        return dq.peekFirst();
    }

    public int getmax() {
        return dq.peekLast();
    }

    public int extractmin() {
        return dq.pollFirst();
    }

    public int extractmax() {
        return dq.pollLast();
    }
}
