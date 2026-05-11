import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CandyDistributorTest {
    @Test
    void testCandy() {
        assertEquals(5, CandyDistributor.candy(new int[]{1,0,2}));
    }

    @Test
    void testAllEqual() {
        assertEquals(3, CandyDistributor.candy(new int[]{1,1,1}));
    }
}