import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeFinderTest {
    @Test
    void testPalindrome() {
        LongestPalindromeFinder l =
                new LongestPalindromeFinder();

        assertEquals("aba",
                l.longest("caba"));
    }

    @Test
    void testSingleChar() {
        LongestPalindromeFinder l =
                new LongestPalindromeFinder();

        assertEquals("a",
                l.longest("a"));
    }

    @Test
    void testEmpty() {
        LongestPalindromeFinder l =
                new LongestPalindromeFinder();

        assertEquals("",
                l.longest(""));
    }
}