import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumProductWordLengthTest {
    @Test
    void testMaxProduct() {
        assertEquals(16, MaximumProductWordLength.maxProduct(new String[]{"abcw","baz","foo","bar","xtfn","abcdef"})); // fails
    }
}