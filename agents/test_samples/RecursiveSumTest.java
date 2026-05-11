import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RecursiveSumTest {
    @Test
    void testFive() {
        assertEquals(15, RecursiveSum.sum(5));
    }

    @Test
    void testZero() {
        assertEquals(0, RecursiveSum.sum(0));
    }

    @Test
    void testOne() {
        assertEquals(1, RecursiveSum.sum(1));
    }

    @Test
    void testTen() {
        assertEquals(55, RecursiveSum.sum(10));
    }

    @Test
    void testNegative() {
        assertEquals(0, RecursiveSum.sum(-3));
    }

    @Test
    void testLarge() {
        assertEquals(5050, RecursiveSum.sum(100));
    }
}