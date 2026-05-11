import java.util.Iterator;

public class PeekingIteratorII implements Iterator<Integer> {
    private final Iterator<Integer> iterator;
    private Integer nextValue;

    public PeekingIteratorII(Iterator<Integer> iterator) {
        this.iterator = iterator;
        if (iterator.hasNext()) nextValue = iterator.next();
    }

    public Integer peek() {
        return nextValue;
    }

    @Override
    public Integer next() {
        Integer result = nextValue;
        nextValue = iterator.hasNext() ? iterator.next() : null;
        return result;
    }

    @Override
    public boolean hasNext() {
        return nextValue != null;
    }
}