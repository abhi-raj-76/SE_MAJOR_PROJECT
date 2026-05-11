import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LeapYearUtilityTest {
    @Test
    void testLeapYear() {
        LeapYearUtility l = new LeapYearUtility();
        assertTrue(l.isLeap(2024));
    }
}