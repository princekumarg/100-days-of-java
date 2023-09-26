package queue;

public class Dequeue {
    int size, cap;
    int arr[];

    Dequeue(int c) {
        cap = c;
        size = 0;
        arr = new int[cap];
    }
}
