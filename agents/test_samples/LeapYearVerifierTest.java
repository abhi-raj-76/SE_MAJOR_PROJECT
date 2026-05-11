import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LeapYearVerifierTest {
    @Test
    void testLeapYear() {
        LeapYearVerifier l = new LeapYearVerifier();
        assertTrue(l.leap(2024));
    }
}