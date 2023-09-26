package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reversing {
    public static void revers(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        while (q.isEmpty() == false) {
            s.push(q.peek());
            q.remove();
        }
        while (s.empty() == false) {
            q.add(s.peek());
            s.pop();
        }
    }

    public static void reverse(Queue<Integer> q) {
        if (q.isEmpty()) {
            return;
        }
        int x = q.peek();
        q.remove();
        reverse(q);
        q.add(x);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        revers(q);
        System.out.println(q);
        reverse(q);
        System.out.println(q);
    }
}
