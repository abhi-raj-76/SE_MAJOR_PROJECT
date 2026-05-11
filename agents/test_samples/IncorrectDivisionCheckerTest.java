import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IncorrectDivisionCheckerTest {

    @Test
    void testDivisible() {
        IncorrectDivisionChecker i =
                new IncorrectDivisionChecker();

        assertTrue(
                i.divisible(10,5)
        );
    }

    @Test
    void testNotDivisible() {
        IncorrectDivisionChecker i =
                new IncorrectDivisionChecker();

        assertFalse(
                i.divisible(7,3)
        );
    }
}