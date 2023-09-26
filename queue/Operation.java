package queue;

public class Operation {
    public boolean isFull(Dequeue q) {
        return (q.size == q.cap);
    }

    public boolean isEmpty(Dequeue q) {
        return (q.size == 0);
    }

    public void insertRear(Dequeue q, int x) {
        if (isFull(q)) {
            return;
        }
        q.arr[q.size] = x;
        q.size++;
    }

    public void deleteRear(Dequeue q) {
        if (isEmpty(q)) {
            return;
        }
        q.size--;
    }

    public int getRear(Dequeue q) {
        if (isEmpty(q)) {
            return -1;
        }
        return (q.size - 1);
    }

    public void insertFront(Dequeue q, int x) {
        if (isFull(q)) {
            return;
        }
        for (int i = q.size - 1; i >= 0; i--) {
            q.arr[i + 1] = q.arr[i];
        }
        q.arr[0] = x;
        q.size++;
    }

    public void deleteFront(Dequeue q) {
        if (isEmpty(q)) {
            return;
        }
        for (int i = 0; i < q.size - 1; i++) {
            q.arr[i] = q.arr[i + 1];
        }
        q.size--;
    }

    public int getFront(Dequeue q) {
        if (isEmpty(q)) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

    }
}
