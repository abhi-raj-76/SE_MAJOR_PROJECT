import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvalidLoopBuilderTest {
    @Test
    void testObject() {
        InvalidLoopBuilder i =
                new InvalidLoopBuilder();

        assertNotNull(i);
    }

    @Test
    void testAnother() {
        InvalidLoopBuilder i =
                new InvalidLoopBuilder();

        assertTrue(i != null);
    }

    @Test
    void testSimple() {
        InvalidLoopBuilder i =
                new InvalidLoopBuilder();

        assertEquals(
                InvalidLoopBuilder.class,
                i.getClass()
        );
    }
}