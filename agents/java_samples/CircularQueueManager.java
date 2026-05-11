public class CircularQueueManager {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public CircularQueueManager(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean enqueue(int val) {
        if (size == queue.length) {
            return false;
        }

        rear = (rear + 1) % queue.length;
        queue[rear] = val;
        size++;
        return true;
    }

    public int dequeue() {
        if (size == 0) {
            return -1;
        }

        int value = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return value;
    }
}