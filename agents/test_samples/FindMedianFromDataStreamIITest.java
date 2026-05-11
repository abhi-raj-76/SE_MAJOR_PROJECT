import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindMedianFromDataStreamIITest {
    @Test
    void testMedian() {
        FindMedianFromDataStreamII fm = new FindMedianFromDataStreamII();
        fm.addNum(1);
        assertEquals(0.0, fm.findMedian());
    }
}