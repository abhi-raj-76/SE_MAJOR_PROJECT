import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvalidReturnBuilderTest {
    @Test
    void testBuild() {
        InvalidReturnBuilder i =
                new InvalidReturnBuilder();

        assertEquals(1, i.build());
    }

    @Test
    void testAgain() {
        InvalidReturnBuilder i =
                new InvalidReturnBuilder();

        assertEquals(1, i.build());
    }

    @Test
    void testAnother() {
        InvalidReturnBuilder i =
                new InvalidReturnBuilder();

        assertEquals(1, i.build());
    }
}