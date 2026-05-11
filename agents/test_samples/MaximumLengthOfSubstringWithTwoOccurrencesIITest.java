import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumLengthOfSubstringWithTwoOccurrencesIITest {
    @Test
    void testMaxLength() {
        assertEquals(5, MaximumLengthOfSubstringWithTwoOccurrencesII.maxLength("abcabc")); // fails
    }
}