import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NullDivisionProcessorTest {
    @Test
    void testDivide() {
        NullDivisionProcessor n =
                new NullDivisionProcessor();

        assertEquals(2, n.process(10,5));
    }

    @Test
    void testZeroDivision() {
        NullDivisionProcessor n =
                new NullDivisionProcessor();

        assertThrows(
                ArithmeticException.class,
                () -> n.process(5,0)
        );
    }

    @Test
    void testNullInput() {
        NullDivisionProcessor n =
                new NullDivisionProcessor();

        assertThrows(
                NullPointerException.class,
                () -> n.process(null,2)
        );
    }
}