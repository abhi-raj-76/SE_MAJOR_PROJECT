import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AsFarFromLandAsPossibleIITest {
    @Test
    void testDistance() {
        assertEquals(-1, AsFarFromLandAsPossibleII.maxDistance(new int[][]{{1}}));
    }
}