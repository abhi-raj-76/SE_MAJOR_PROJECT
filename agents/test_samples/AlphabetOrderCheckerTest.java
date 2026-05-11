import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlphabetOrderCheckerTest {
    @Test
    void testOrdered() {
        AlphabetOrderChecker a = new AlphabetOrderChecker();
        assertTrue(a.ordered("abc"));
    }
}