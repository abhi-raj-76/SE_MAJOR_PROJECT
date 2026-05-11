import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindMedianFromDataStreamTest {
    @Test
    void testMedian() {
        FindMedianFromDataStream fm = new FindMedianFromDataStream();
        fm.addNum(1);
        assertEquals(0.0, fm.findMedian());
    }
}