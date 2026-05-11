import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxOfThreeNumbersTest {
    @Test
    void testMax() {
        MaxOfThreeNumbers m = new MaxOfThreeNumbers();
        assertEquals(9, m.max(3,9,4));
    }
}