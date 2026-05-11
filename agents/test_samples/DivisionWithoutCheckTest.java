import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DivisionWithoutCheckTest {

    @Test
    void testDivide() {
        DivisionWithoutCheck d =
                new DivisionWithoutCheck();

        assertEquals(2,
                d.divide(10,5));
    }

    @Test
    void testException() {
        DivisionWithoutCheck d =
                new DivisionWithoutCheck();

        assertThrows(
                ArithmeticException.class,
                () -> d.divide(5,0)
        );
    }
}