import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoLinkedListsTest {
    @Test
    void testIntersection() {
        assertNull(IntersectionOfTwoLinkedLists.getIntersectionNode(null, null));
    }
}