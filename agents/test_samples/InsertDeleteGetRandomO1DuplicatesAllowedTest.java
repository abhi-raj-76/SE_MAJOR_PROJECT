import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InsertDeleteGetRandomO1DuplicatesAllowedTest {
    @Test
    void testRandom() {
        InsertDeleteGetRandomO1DuplicatesAllowed set = new InsertDeleteGetRandomO1DuplicatesAllowed();
        assertTrue(set.insert(1));
    }
}