package Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyHashLL {
    int Bucket;
    ArrayList<LinkedList<Integer>> t = new ArrayList<>();

    MyHashLL(int b) {
        Bucket = b;
        t = new ArrayList<LinkedList<Integer>>();
        for (int i = 0; i < b; i++) {
            t.add(new LinkedList<Integer>());
        }
    }

    public void insert(int key) {
        int i = key % Bucket;
        t.get(i).add(key);
    }

    public void remove(int key) {
        int i = key % Bucket;
        t.get(i).remove((Integer) i);
    }

    public boolean search(int key) {
        int i = key % Bucket;
        return t.get(i).contains(key);
    }

    public static void main(String[] args) {
        MyHashLL h = new MyHashLL(7);
        h.insert(10);
        h.insert(20);
        h.insert(15);
        h.insert(7);
        System.out.println(h.search(10));
        h.remove(20);
        System.out.println(h.search(20));

    }

}
