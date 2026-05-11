public class MovingAverageIII {
    private final int size;
    private final java.util.Queue<Integer> queue = new java.util.LinkedList<>();
    private int sum = 0;

    public MovingAverageIII(int size) {
        this.size = size;
    }

    public double next(int val) {
        sum += val;
        queue.offer(val);
        if (queue.size() > size) sum -= queue.poll();
        return (double) sum / queue.size();
    }
}