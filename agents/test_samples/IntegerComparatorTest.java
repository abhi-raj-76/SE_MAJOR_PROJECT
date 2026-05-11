import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntegerComparatorTest {
    @Test
    void testLarger() {
        IntegerComparator i = new IntegerComparator();
        assertEquals(10, i.larger(10,5));
    }
}