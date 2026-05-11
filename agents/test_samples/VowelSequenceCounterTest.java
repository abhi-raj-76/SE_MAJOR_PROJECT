import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VowelSequenceCounterTest {
    @Test
    void testCount() {
        VowelSequenceCounter v =
                new VowelSequenceCounter();

        assertEquals(
                2,
                v.count("hello")
        );
    }

    @Test
    void testUpperCase() {
        VowelSequenceCounter v =
                new VowelSequenceCounter();

        assertEquals(
                5,
                v.count("AEIOU")
        );
    }
}