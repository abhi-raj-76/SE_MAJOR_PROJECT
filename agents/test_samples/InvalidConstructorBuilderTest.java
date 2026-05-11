import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvalidConstructorBuilderTest {
    @Test
    void testCube() {
        assertEquals(
                27,
                InvalidConstructorBuilder.cube(3)
        );
    }

    @Test
    void testZero() {
        assertEquals(
                0,
                InvalidConstructorBuilder.cube(0)
        );
    }

    @Test
    void testNegative() {
        assertEquals(
                -8,
                InvalidConstructorBuilder.cube(-2)
        );
    }
}