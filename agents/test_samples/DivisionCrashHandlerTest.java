import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DivisionCrashHandlerTest {

    @Test
    void testDivide() {
        DivisionCrashHandler d =
                new DivisionCrashHandler();

        assertEquals(2, d.divide(10,5));
    }

    @Test
    void testCrash() {
        DivisionCrashHandler d =
                new DivisionCrashHandler();

        assertThrows(
                ArithmeticException.class,
                () -> d.divide(5,0)
        );
    }
}