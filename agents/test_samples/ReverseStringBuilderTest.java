import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseStringBuilderTest {

    @Test
    void testReverse() {
        ReverseStringBuilder r =
                new ReverseStringBuilder();

        assertEquals(
                "olleh",
                r.reverse("hello")
        );
    }

    @Test
    void testSingle() {
        ReverseStringBuilder r =
                new ReverseStringBuilder();

        assertEquals(
                "a",
                r.reverse("a")
        );
    }
}