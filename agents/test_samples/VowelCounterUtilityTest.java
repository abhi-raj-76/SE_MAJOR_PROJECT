import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VowelCounterUtilityTest {
    @Test
    void testVowels() {
        assertEquals(
                5,
                VowelCounterUtility.countVowels("education")
        );
    }

    @Test
    void testNoVowels() {
        assertEquals(
                0,
                VowelCounterUtility.countVowels("rhythm")
        );
    }

    @Test
    void testUpperCase() {
        assertEquals(
                2,
                VowelCounterUtility.countVowels("JAVA")
        );
    }
}