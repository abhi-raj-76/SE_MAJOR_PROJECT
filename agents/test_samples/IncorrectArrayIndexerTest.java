import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IncorrectArrayIndexerTest {
    @Test
    void testLast() {
        IncorrectArrayIndexer i =
                new IncorrectArrayIndexer();

        assertEquals(
                5,
                i.last(new int[]{1,2,5})
        );
    }

    @Test
    void testSingle() {
        IncorrectArrayIndexer i =
                new IncorrectArrayIndexer();

        assertEquals(
                9,
                i.last(new int[]{9})
        );
    }

    @Test
    void testTwo() {
        IncorrectArrayIndexer i =
                new IncorrectArrayIndexer();

        assertEquals(
                3,
                i.last(new int[]{2,3})
        );
    }
}