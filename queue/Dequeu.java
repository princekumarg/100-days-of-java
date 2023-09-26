package queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Dequeu {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.offerFirst(10);
        d.offerLast(20);
        d.offerFirst(30);
        d.offerLast(40);
        d.addFirst(10);
        d.addLast(20);
        d.addFirst(5);
        d.addLast(15);
        System.out.print(d.peekFirst() + " ");
        System.out.print(d.peekLast() + " ");
        d.pollFirst();
        d.pollLast();
        System.out.print(d.peekFirst() + " ");
        System.out.print(d.peekLast() + " ");
        System.out.println();
        System.out.print(d.getFirst() + " ");
        System.out.print(d.getLast() + " ");
        d.removeFirst();
        d.removeLast();
        System.out.print(d.getFirst() + " ");
        System.out.print(d.getLast() + " ");
        System.out.println();
        for (Iterator itr = d.iterator(); itr.hasNext();) {
            System.out.print(itr.next() + " ");
        }
        for (int x : d) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (Iterator itr = d.descendingIterator(); itr.hasNext();) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        // =====ArrayDeque=====//
        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
        ad.add(10);
        ad.add(20);
        ad.add(30);
        ad.add(30);
        System.out.print(ad);
        System.out.println();
        ad.push(10);
        ad.push(20);
        System.out.print(ad.peek() + " ");
        System.out.print(ad.pop() + " ");
        System.out.print(ad.peek() + " ");
        ad.push(40);
        System.out.print(ad.peek() + " ");
        System.out.println();
        ad.offer(10);
        ad.offer(20);
        System.out.print(ad.peek() + " ");
        System.out.print(ad.poll() + " ");
        System.out.print(ad.peek() + " ");
        ad.offer(40);
        System.out.print(ad.peek() + " ");
        System.out.println();
        ad.offerFirst(10);
        ad.offerLast(20);
        ad.offerFirst(30);
        ad.offerLast(40);
        System.out.print(ad.peekFirst() + " ");
        System.out.print(ad.peekLast() + " ");
        System.out.print(ad.pollFirst() + " ");
        System.out.print(ad.peekFirst() + " ");
        System.out.print(ad.pollLast() + " ");
        System.out.println(ad.peekLast() + " ");
        System.out.println();
    }
}
