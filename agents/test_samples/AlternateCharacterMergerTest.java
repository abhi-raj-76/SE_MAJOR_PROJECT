import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlternateCharacterMergerTest {
    @Test
    void testMerge() {
        AlternateCharacterMerger a =
                new AlternateCharacterMerger();

        assertEquals(
                "a1b2c3",
                a.merge("abc","123")
        );
    }

    @Test
    void testDifferentLengths() {
        AlternateCharacterMerger a =
                new AlternateCharacterMerger();

        assertEquals(
                "a1b23",
                a.merge("ab","123")
        );
    }
}