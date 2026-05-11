import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SuperUglyNumberTest {
    @Test
    void testSuperUgly() {
        assertEquals(1, SuperUglyNumber.nthSuperUglyNumber(1, new int[]{2,3,5})); // fails
    }
}