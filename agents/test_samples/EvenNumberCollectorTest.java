import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class EvenNumberCollectorTest {
    @Test
    void testCollect() {
        List<Integer> result =
                EvenNumberCollector.collect(
                        new int[]{1,2,3,4,5,6}
                );

        assertEquals(3, result.size());
    }

    @Test
    void testNoEven() {
        List<Integer> result =
                EvenNumberCollector.collect(
                        new int[]{1,3,5}
                );

        assertEquals(0, result.size());
    }

    @Test
    void testEmpty() {
        List<Integer> result =
                EvenNumberCollector.collect(
                        new int[]{}
                );

        assertTrue(result.isEmpty());
    }
}