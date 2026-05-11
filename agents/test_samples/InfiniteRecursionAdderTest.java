import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InfiniteRecursionAdderTest {

    @Test
    void testAdd() {
        InfiniteRecursionAdder i =
                new InfiniteRecursionAdder();

        assertEquals(7, i.add(3,4));
    }
}