import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringEqualityCheckerTest {
    @Test
    void testEquality() {
        StringEqualityChecker s = new StringEqualityChecker();
        assertTrue(s.equal(new String("java"), new String("java")));
    }
}