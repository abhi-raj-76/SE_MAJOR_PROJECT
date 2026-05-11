import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumLengthOfSubstringWithTwoOccurrencesTest {
    @Test
    void testMaxLength() {
        assertEquals(5, MaximumLengthOfSubstringWithTwoOccurrences.maxLength("abcabc")); // fails
    }
}