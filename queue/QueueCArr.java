package queue;

public class QueueCArr {
    int arr[];
    int front, cap, size;

    QueueCArr(int c) {
        arr = new int[c];
        cap = c;
        front = 0;
        size = 0;
    }

    public boolean isFull() {
        return (size == cap);
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public int getFront() {
        if (isEmpty())
            return -1;
        else
            return front;
    }

    public int getRear() {
        if (isEmpty())
            return -1;
        else
            return (front + size - 1) % cap;
    }

    public void enqueue(int x) {
        if (isFull())
            return;
        int rear = getRear();
        rear = (rear + 1) % cap;
        arr[rear] = x;
        size++;
    }

    public void deque() {
        if (isEmpty())
            return;
        front = (front + 1) % cap;
        size--;
    }
}
