import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VowelPresenceCheckerTest {
    @Test
    void testHasVowel() {
        VowelPresenceChecker v = new VowelPresenceChecker();
        assertTrue(v.hasVowel("java"));
    }
}