import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorUtilTest {
    @Test void testValid() {
        assertTrue(EmailValidatorUtil.isValid("test@example.com"));
    }
    @Test void testBug() {
        assertFalse(EmailValidatorUtil.isValid("invalid@")); // Should be false but logic is buggy
    }
}