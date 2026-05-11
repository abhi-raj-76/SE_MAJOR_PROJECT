import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AuthenticationManagerIITest {
    @Test
    void testAuth() {
        AuthenticationManagerII am = new AuthenticationManagerII(5);
        am.generate("aaa", 1);
        assertEquals(1, am.countUnexpiredTokens(3));
    }
}