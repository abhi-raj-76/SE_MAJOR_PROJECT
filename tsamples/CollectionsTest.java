import java.util.*;

public class CollectionsTest {
    @Test
    void testAdd() {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        assertEquals("[1, 2, 3, 4, 5]", list.toString());
        assertEquals("[1, 2, 3, 4, 5]", set.toString());
    }
}