package queue;

public class QueueNArr {
    int size, cap;
    int[] arr;

    QueueNArr(int c) {
        cap = c;
        size = 0;
        arr = new int[cap];
    }

    public boolean isFull() {
        return (size == cap);
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void enqueue(int x) {
        if (isFull())
            return;
        arr[size] = x;
        size++;
    }

    public void deque() {
        if (isEmpty())
            return;
        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    public int getFront() {
        if (isEmpty())
            return -1;
        else
            return 0;
    }

    public int getRear() {
        if (isEmpty())
            return -1;
        else
            return size - 1;
    }
}
