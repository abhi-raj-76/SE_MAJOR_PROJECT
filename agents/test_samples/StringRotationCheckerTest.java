import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringRotationCheckerTest {
    @Test
    void testRotation() {
        StringRotationChecker s = new StringRotationChecker();
        assertTrue(s.isRotation("abcd", "cdab"));
    }
}