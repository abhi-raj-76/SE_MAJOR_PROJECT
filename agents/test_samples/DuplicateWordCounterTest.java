import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DuplicateWordCounterTest {

    @Test
    void testDuplicates() {
        DuplicateWordCounter d =
                new DuplicateWordCounter();

        assertEquals(
                2,
                d.countDuplicates(
                        new String[]{
                                "a","b","a","c","b"
                        }
                )
        );
    }

    @Test
    void testUnique() {
        DuplicateWordCounter d =
                new DuplicateWordCounter();

        assertEquals(
                0,
                d.countDuplicates(
                        new String[]{
                                "x","y"
                        }
                )
        );
    }
}