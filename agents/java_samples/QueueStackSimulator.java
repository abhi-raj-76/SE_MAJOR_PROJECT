import java.util.LinkedList;
import java.util.Queue;

public class QueueStackSimulator {

    private Queue<Integer> queue =
            new LinkedList<>();

    public void push(int val) {

        queue.offer(val);

        for (int i = 0;
             i < queue.size() - 1;
             i++) {

            queue.offer(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }
}