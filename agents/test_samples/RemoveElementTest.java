import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {
    @Test
    void testRemoveSome() {
        int[] arr = {3,2,2,3};
        assertEquals(2, RemoveElement.remove(arr, 3));
    }

    @Test
    void testRemoveNone() {
        int[] arr = {1,2,3};
        assertEquals(3, RemoveElement.remove(arr, 4));
    }

    @Test
    void testAllRemove() {
        int[] arr = {5,5,5};
        assertEquals(0, RemoveElement.remove(arr, 5));
    }

    @Test
    void testEmpty() {
        assertEquals(0, RemoveElement.remove(new int[0], 1));
    }

    @Test
    void testNull() {
        assertEquals(0, RemoveElement.remove(null, 1));
    }

    @Test
    void testSingle() {
        int[] arr = {10};
        assertEquals(0, RemoveElement.remove(arr, 10));
    }
}