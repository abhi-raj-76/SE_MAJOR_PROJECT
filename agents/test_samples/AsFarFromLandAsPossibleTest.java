import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AsFarFromLandAsPossibleTest {
    @Test
    void testDistance() {
        assertEquals(-1, AsFarFromLandAsPossible.maxDistance(new int[][]{{1}}));
    }
}