import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RecursiveListSummerTest {
    @Test
    void testSum() {
        RecursiveListSummer r =
                new RecursiveListSummer();

        assertEquals(
                10,
                r.sum(new int[]{1,2,3,4},0)
        );
    }

    @Test
    void testSingle() {
        RecursiveListSummer r =
                new RecursiveListSummer();

        assertEquals(
                5,
                r.sum(new int[]{5},0)
        );
    }
}