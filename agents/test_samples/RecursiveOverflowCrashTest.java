import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RecursiveOverflowCrashTest {

    @Test
    void testFactorial() {
        RecursiveOverflowCrash r =
                new RecursiveOverflowCrash();

        assertEquals(120, r.factorial(5));
    }
}