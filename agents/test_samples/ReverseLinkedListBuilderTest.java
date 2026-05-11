import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListBuilderTest {
    @Test
    void testReverseList() {
        ReverseLinkedListBuilder.Node a =
                new ReverseLinkedListBuilder.Node(1);

        a.next =
                new ReverseLinkedListBuilder.Node(2);

        ReverseLinkedListBuilder r =
                new ReverseLinkedListBuilder();

        assertEquals(2, r.reverse(a).val);
    }
}