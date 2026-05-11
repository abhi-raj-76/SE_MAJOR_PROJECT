import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringSuffixCheckerTest {
    @Test
    void testSuffix() {
        StringSuffixChecker s = new StringSuffixChecker();
        assertTrue(s.ends("developer", "per"));
    }
}