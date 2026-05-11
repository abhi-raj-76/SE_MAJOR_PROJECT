import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvenSquareGeneratorTest {
    @Test
    void testGenerate() {
        EvenSquareGenerator e = new EvenSquareGenerator();
        assertArrayEquals(new int[]{0,4,16}, e.generate(3));
    }
}