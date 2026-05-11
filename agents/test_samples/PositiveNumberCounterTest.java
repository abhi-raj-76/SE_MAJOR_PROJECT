import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PositiveNumberCounterTest {
    @Test
    void testPositiveCount() {
        PositiveNumberCounter p =
                new PositiveNumberCounter();

        assertEquals(
                3,
                p.count(
                        new int[]{1,-1,5,0,8}
                )
        );
    }

    @Test
    void testNone() {
        PositiveNumberCounter p =
                new PositiveNumberCounter();

        assertEquals(
                0,
                p.count(
                        new int[]{-1,-2,0}
                )
        );
    }
}