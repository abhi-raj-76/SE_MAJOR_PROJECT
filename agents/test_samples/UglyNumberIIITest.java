import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UglyNumberIIITest {
    @Test
    void testSuperUgly() {
        assertEquals(1, UglyNumberIII.nthUglyNumber(1, new int[]{2})); // fails
    }
}