import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortedSquareGeneratorTest {
    @Test
    void testSquares() {
        SortedSquareGenerator s = new SortedSquareGenerator();
        assertArrayEquals(new int[]{0,1,9,16,100},
                s.generate(new int[]{-4,-1,0,3,10}));
    }
}