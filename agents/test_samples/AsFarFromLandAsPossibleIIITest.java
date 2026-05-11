import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AsFarFromLandAsPossibleIIITest {
    @Test
    void testDistance() {
        assertEquals(-1, AsFarFromLandAsPossibleIII.maxDistance(new int[][]{{1}}));
    }
}