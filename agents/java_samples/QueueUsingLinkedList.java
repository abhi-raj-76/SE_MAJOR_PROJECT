public class QueueUsingLinkedList {
    static class Node {
        int val;
        Node next;
        Node(int v) { val = v; }
    }

    private Node front, rear;

    public void enqueue(int val) {
        Node node = new Node(val);
        if (rear == null) {
            front = rear = node;
            return;
        }
        rear.next = node;
        rear = node;
    }

    public int dequeue() {
        if (front == null) return -1;
        int val = front.val;
        front = front.next;
        if (front == null) rear = null;
        return val;
    }
}