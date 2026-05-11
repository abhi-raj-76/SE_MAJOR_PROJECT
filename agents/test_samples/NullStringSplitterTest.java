import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NullStringSplitterTest {
    @Test
    void testSplit() {
        NullStringSplitter n =
                new NullStringSplitter();

        assertEquals(
                3,
                n.split("a,b,c").length
        );
    }

    @Test
    void testNull() {
        NullStringSplitter n =
                new NullStringSplitter();

        assertThrows(
                NullPointerException.class,
                () -> n.split(null)
        );
    }
}