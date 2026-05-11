import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AuthenticationManagerTest {
    @Test
    void testAuth() {
        AuthenticationManager am = new AuthenticationManager(5);
        am.generate("aaa", 1);
        assertEquals(1, am.countUnexpiredTokens(3));
    }
}