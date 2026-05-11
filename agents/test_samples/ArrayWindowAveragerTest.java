import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayWindowAveragerTest {
    @Test
    void testAverage() {
        ArrayWindowAverager a =
                new ArrayWindowAverager();

        assertEquals(
                2.0,
                a.average(new int[]{1,2,3},2)
        );
    }

    @Test
    void testSingle() {
        ArrayWindowAverager a =
                new ArrayWindowAverager();

        assertEquals(
                5.0,
                a.average(new int[]{5},1)
        );
    }

    @Test
    void testLarge() {
        ArrayWindowAverager a =
                new ArrayWindowAverager();

        assertEquals(
                3.0,
                a.average(new int[]{2,3,4},2)
        );
    }
}