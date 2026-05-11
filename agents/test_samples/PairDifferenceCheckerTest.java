import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PairDifferenceCheckerTest {
    @Test
    void testDifference() {
        PairDifferenceChecker p =
                new PairDifferenceChecker();

        assertTrue(
                p.hasDifference(
                        new int[]{1,5,9},
                        4
                )
        );
    }

    @Test
    void testNoDifference() {
        PairDifferenceChecker p =
                new PairDifferenceChecker();

        assertFalse(
                p.hasDifference(
                        new int[]{2,4,6},
                        5
                )
        );
    }
}