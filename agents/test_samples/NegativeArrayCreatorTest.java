import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NegativeArrayCreatorTest {
    @Test
    void testArray() {
        assertEquals(
                5,
                NegativeArrayCreator.create().length
        );
    }

    @Test
    void testNotNull() {
        assertNotNull(
                NegativeArrayCreator.create()
        );
    }

    @Test
    void testAgain() {
        assertTrue(
                NegativeArrayCreator.create().length > 0
        );
    }
}