import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciGeneratorTest {

    @Test
    void testFibRecursiveBase() {
        assertEquals(0, FibonacciGenerator.fibRecursive(0));
        assertEquals(1, FibonacciGenerator.fibRecursive(1));
    }

    @Test
    void testFibRecursive() {
        assertEquals(8, FibonacciGenerator.fibRecursive(6));
    }

    @Test
    void testFibIterative() {
        assertEquals(55, FibonacciGenerator.fibIterative(10));
    }

    @Test
    void testFibIterativeMatchesRecursive() {
        for (int i = 0; i < 10; i++)
            assertEquals(FibonacciGenerator.fibRecursive(i), FibonacciGenerator.fibIterative(i));
    }

    @Test
    void testFibSequenceLength() {
        List<Long> seq = FibonacciGenerator.fibSequence(7);
        assertEquals(7, seq.size());
    }

    @Test
    void testFibSequenceValues() {
        List<Long> seq = FibonacciGenerator.fibSequence(5);
        assertEquals(List.of(0L, 1L, 1L, 2L, 3L), seq);
    }

    @Test
    void testIsFibonacciNumber() {
        assertTrue(FibonacciGenerator.isFibonacciNumber(13));
        assertFalse(FibonacciGenerator.isFibonacciNumber(14));
    }

    @Test
    void testNegativeThrows() {
        assertThrows(IllegalArgumentException.class, () -> FibonacciGenerator.fibRecursive(-1));
    }

    @Test
    void testZeroIsFibonacci() {
        assertTrue(FibonacciGenerator.isFibonacciNumber(0));
    }

    @Test
    void testLargeFib() {
        assertEquals(6765, FibonacciGenerator.fibIterative(20));
    }
}