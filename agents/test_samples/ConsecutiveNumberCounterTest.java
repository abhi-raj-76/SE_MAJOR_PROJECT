import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConsecutiveNumberCounterTest {
    @Test
    void testCount() {
        ConsecutiveNumberCounter c =
                new ConsecutiveNumberCounter();

        assertEquals(
                2,
                c.countConsecutive(
                        new int[]{1,2,4,5}
                )
        );
    }

    @Test
    void testEmpty() {
        ConsecutiveNumberCounter c =
                new ConsecutiveNumberCounter();

        assertEquals(
                0,
                c.countConsecutive(new int[]{})
        );
    }
}