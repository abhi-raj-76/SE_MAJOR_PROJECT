import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IncorrectLeapYearCheckerTest {
    @Test
    void testLeapYears() {
        assertTrue(
                IncorrectLeapYearChecker.isLeap(2020)
        );

        assertTrue(
                IncorrectLeapYearChecker.isLeap(2000)
        );
    }

    @Test
    void testNonLeapYears() {
        assertFalse(
                IncorrectLeapYearChecker.isLeap(1900)
        );

        assertFalse(
                IncorrectLeapYearChecker.isLeap(2023)
        );
    }

    @Test
    void testEdge() {
        assertTrue(
                IncorrectLeapYearChecker.isLeap(4)
        );
    }
}