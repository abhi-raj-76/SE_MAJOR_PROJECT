import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class LetterCombinationsPhoneVITest {
    @Test
    void testCombinations() {
        LetterCombinationsPhoneVI solver = new LetterCombinationsPhoneVI();
        List<String> result = solver.letterCombinations("23");
        assertFalse(result.isEmpty());
    }
}