import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BrokenConstructorExampleTest {
    @Test
    void testValue() {
        BrokenConstructorExample b =
                new BrokenConstructorExample();

        assertEquals(10, b.value());
    }

    @Test
    void testAgain() {
        BrokenConstructorExample b =
                new BrokenConstructorExample();

        assertEquals(10, b.value());
    }

    @Test
    void testThird() {
        BrokenConstructorExample b =
                new BrokenConstructorExample();

        assertEquals(10, b.value());
    }
}