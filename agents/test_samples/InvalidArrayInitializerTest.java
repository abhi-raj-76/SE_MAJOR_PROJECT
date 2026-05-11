import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvalidArrayInitializerTest {
    @Test
    void testCreate() {
        InvalidArrayInitializer i =
                new InvalidArrayInitializer();

        assertNotNull(i);
    }

    @Test
    void testClass() {
        InvalidArrayInitializer i =
                new InvalidArrayInitializer();

        assertEquals(
                InvalidArrayInitializer.class,
                i.getClass()
        );
    }

    @Test
    void testAnother() {
        InvalidArrayInitializer i =
                new InvalidArrayInitializer();

        assertTrue(i != null);
    }
}