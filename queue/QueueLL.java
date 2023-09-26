package queue;

public class QueueLL {
    NodeLL front, rear;
    int size;

    public QueueLL() {
        front = rear = null;
        size = 0;
    }

    public void enqueue(int x) {
        NodeLL temp = new NodeLL(x);
        size++;
        if (rear == null) {
            front = rear = temp;
            return;
        }
        rear.next = temp;
        rear = temp;
    }

    public void deque() {
        size--;
        if (front == null) {
            return;
        }
        front = front.next;
        if (front == null) {
            rear = null;
        }
    }
}
