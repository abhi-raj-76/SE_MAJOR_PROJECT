import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {
    @Test
    void testValid() {
        assertTrue(EmailValidator.isValidEmail("test@example.com"));
    }

    @Test
    void testOrgDomain() {
        assertTrue(EmailValidator.isValidEmail("user@company.org")); // fails due to .com
    }

    @Test
    void testInvalid() {
        assertFalse(EmailValidator.isValidEmail("invalid@com"));
    }

    @Test
    void testNull() {
        assertFalse(EmailValidator.isValidEmail(null));
    }

    @Test
    void testNoAt() {
        assertFalse(EmailValidator.isValidEmail("test.com"));
    }

    @Test
    void testSpecial() {
        assertTrue(EmailValidator.isValidEmail("user.name+tag@example.com"));
    }
}