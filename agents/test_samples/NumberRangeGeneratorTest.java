import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberRangeGeneratorTest {
    @Test
    void testRange() {
        NumberRangeGenerator n = new NumberRangeGenerator();
        assertArrayEquals(new int[]{3,4,5,6}, n.range(3,6));
    }
}