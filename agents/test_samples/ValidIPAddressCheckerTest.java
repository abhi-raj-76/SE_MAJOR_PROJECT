import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidIPAddressCheckerTest {
    @Test
    void testIPv4Valid() {
        assertEquals("IPv4", ValidIPAddressChecker.validIPAddress("172.16.254.1"));
    }
    @Test
    void testIPv4Invalid() {
        assertEquals("Neither", ValidIPAddressChecker.validIPAddress("256.256.256.256"));
    }
    @Test
    void testIPv6Valid() {
        assertEquals("IPv6", ValidIPAddressChecker.validIPAddress("2001:db8:85a3:0:0:8a2e:370:7334"));
    }
    @Test
    void testEmpty() {
        assertEquals("Neither", ValidIPAddressChecker.validIPAddress(""));
    }
    @Test
    void testInvalidFormat() {
        assertEquals("Neither", ValidIPAddressChecker.validIPAddress("1.2.3"));
    }
}