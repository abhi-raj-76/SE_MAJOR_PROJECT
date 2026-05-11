import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MajorityElementFinderTest {
    @Test
    void testStandard() {
        assertEquals(3, MajorityElementFinder.findMajority(new int[]{3,2,3}));
    }
    @Test
    void testNoMajority() {
        assertEquals(1, MajorityElementFinder.findMajority(new int[]{1,2,3})); // Buggy returns wrong
    }
    @Test
    void testAllSame() {
        assertEquals(5, MajorityElementFinder.findMajority(new int[]{5,5,5,5}));
    }
    @Test
    void testSingle() {
        assertEquals(10, MajorityElementFinder.findMajority(new int[]{10}));
    }
    @Test
    void testTwoElements() {
        assertEquals(2, MajorityElementFinder.findMajority(new int[]{2,1,2}));
    }
}