import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordStrengthCheckerTest {
    @Test
    void testStrong() {
        assertEquals(4, PasswordStrengthChecker.checkStrength("Pass123!")); // fails
    }

    @Test
    void testWeak() {
        assertEquals(0, PasswordStrengthChecker.checkStrength("abc"));
    }

    @Test
    void testMedium() {
        assertEquals(2, PasswordStrengthChecker.checkStrength("Password1"));
    }

    @Test
    void testNull() {
        assertEquals(0, PasswordStrengthChecker.checkStrength(null));
    }

    @Test
    void testSpecial() {
        assertEquals(3, PasswordStrengthChecker.checkStrength("Abc@1234"));
    }
}