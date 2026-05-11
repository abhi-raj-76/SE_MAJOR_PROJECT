import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RotateListTest {
    @Test
    void testRotate() {
        RotateList.ListNode head = new RotateList.ListNode(1);
        head.next = new RotateList.ListNode(2);
        head.next.next = new RotateList.ListNode(3);
        assertNotNull(RotateList.rotateRight(head, 1));
    }
}