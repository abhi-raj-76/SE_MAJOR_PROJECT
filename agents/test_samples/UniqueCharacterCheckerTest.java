import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UniqueCharacterCheckerTest {
    @Test
    void testUnique() {
        assertTrue(
                UniqueCharacterChecker
                        .hasUnique("abc")
        );
    }

    @Test
    void testDuplicate() {
        assertFalse(
                UniqueCharacterChecker
                        .hasUnique("hello")
        );
    }

    @Test
    void testEmpty() {
        assertTrue(
                UniqueCharacterChecker
                        .hasUnique("")
        );
    }
}