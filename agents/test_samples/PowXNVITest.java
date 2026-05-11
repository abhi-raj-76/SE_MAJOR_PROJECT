import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PowXNVITest {
    @Test
    void testPow() {
        PowXNVI solver = new PowXNVI();
        assertEquals(8.0, solver.myPow(2,3));
    }
}