import java.util.PriorityQueue;

public class HeapPriorityManager {
    private PriorityQueue<Integer> heap =
            new PriorityQueue<>();

    public void add(int val) {
        heap.offer(val);
    }

    public int remove() {
        return heap.poll();
    }

    public int peek() {
        return heap.peek();
    }
}