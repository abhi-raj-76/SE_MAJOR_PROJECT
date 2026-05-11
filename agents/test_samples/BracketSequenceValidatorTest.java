import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BracketSequenceValidatorTest {
    @Test
    void testValid() {
        BracketSequenceValidator b = new BracketSequenceValidator();
        assertFalse(b.valid("(()"));
    }
}