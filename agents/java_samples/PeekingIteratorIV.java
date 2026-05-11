import java.util.Iterator;

public class PeekingIteratorIV implements Iterator<Integer> {
    private final Iterator<Integer> iterator;
    private Integer next = null;

    public PeekingIteratorIV(Iterator<Integer> iterator) {
        this.iterator = iterator;
        if (iterator.hasNext()) next = iterator.next();
    }

    public Integer peek() {
        return next;
    }

    @Override
    public Integer next() {
        Integer result = next;
        next = iterator.hasNext() ? iterator.next() : null;
        return result;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }
}