import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NegativeArrayAllocatorTest {
    @Test
    void testValidSize() {
        NegativeArrayAllocator n =
                new NegativeArrayAllocator();

        assertEquals(
                5,
                n.create(5).length
        );
    }

    @Test
    void testNegativeSize() {
        NegativeArrayAllocator n =
                new NegativeArrayAllocator();

        assertThrows(
                NegativeArraySizeException.class,
                () -> n.create(-2)
        );
    }
}