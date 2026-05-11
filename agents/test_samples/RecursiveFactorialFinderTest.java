import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RecursiveFactorialFinderTest {
    @Test
    void testFactorial() {
        RecursiveFactorialFinder r = new RecursiveFactorialFinder();
        assertEquals(120, r.factorial(5));
    }
}