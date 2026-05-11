import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindMissingNumberTest {
    @Test
    void testNormal() {
        assertEquals(2, FindMissingNumber.findMissing(new int[]{3,0,1}));
    }
    @Test
    void testSingle() {
        assertEquals(0, FindMissingNumber.findMissing(new int[]{1}));
    }
    @Test
    void testLarge() {
        assertEquals(4, FindMissingNumber.findMissing(new int[]{0,1,2,3,5}));
    }
    @Test
    void testEdgeZero() {
        assertEquals(1, FindMissingNumber.findMissing(new int[]{0}));
    }
    @Test
    void testAllButLast() {
        assertEquals(9, FindMissingNumber.findMissing(new int[]{0,1,2,3,4,5,6,7,8}));
    }
}