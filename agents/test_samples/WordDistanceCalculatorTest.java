import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordDistanceCalculatorTest {
    @Test
    void testShortestDistance() {
        WordDistanceCalculator w =
                new WordDistanceCalculator();

        assertEquals(
                3,
                w.distance(
                        new String[]{
                                "practice",
                                "makes",
                                "perfect",
                                "coding",
                                "makes"
                        },
                        "coding",
                        "practice"
                )
        );
    }
}