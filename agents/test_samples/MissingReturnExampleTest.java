import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MissingReturnExampleTest {
    @Test
    void testMax() {
        MissingReturnExample m =
                new MissingReturnExample();

        assertEquals(5, m.max(5,3));
    }

    @Test
    void testSecond() {
        MissingReturnExample m =
                new MissingReturnExample();

        assertEquals(9, m.max(2,9));
    }

    @Test
    void testEqual() {
        MissingReturnExample m =
                new MissingReturnExample();

        assertEquals(4, m.max(4,4));
    }
}