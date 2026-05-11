import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IncorrectCharacterMatcherTest {

    @Test
    void testContains() {
        IncorrectCharacterMatcher i =
                new IncorrectCharacterMatcher();

        assertTrue(
                i.contains("apple",'p')
        );
    }

    @Test
    void testMissing() {
        IncorrectCharacterMatcher i =
                new IncorrectCharacterMatcher();

        assertFalse(
                i.contains("apple",'z')
        );
    }
}