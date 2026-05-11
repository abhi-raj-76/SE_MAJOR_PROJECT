import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {

    @Test
    void testSimplePalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("racecar"));
    }

    @Test
    void testNotPalindrome() {
        assertFalse(PalindromeChecker.isPalindrome("hello"));
    }

    @Test
    void testPalindromeWithSpaces() {
        assertTrue(PalindromeChecker.isPalindrome("A man a plan a canal Panama"));
    }

    @Test
    void testNullInput() {
        assertFalse(PalindromeChecker.isPalindrome(null));
    }

    @Test
    void testEmptyString() {
        assertTrue(PalindromeChecker.isPalindrome(""));
    }

    @Test
    void testNumericPalindromeTrue() {
        assertTrue(PalindromeChecker.isNumericPalindrome(121));
    }

    @Test
    void testNumericPalindromeFalse() {
        assertFalse(PalindromeChecker.isNumericPalindrome(123));
    }

    @Test
    void testNegativeNumber() {
        assertFalse(PalindromeChecker.isNumericPalindrome(-121));
    }

    @Test
    void testLongestPalindromicSubstring() {
        assertEquals("aba", PalindromeChecker.longestPalindromicSubstring("abacaba").substring(0,3));
    }

    @Test
    void testSingleCharPalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("a"));
    }
}