import java.util.*;

public class CollectionExampleTest {
  @Test
  void testList() {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    assertEquals(5, list.size());
    assertTrue(list.contains(3));
  }

  @Test
  void testSet() {
    Set<String> set = new HashSet<>();
    set.add("apple");
    set.add("banana");
    set.add("cherry");

    assertEquals(3, set.size());
    assertTrue(set.contains("banana"));
  }

  @Test
  void testMap() {
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "apple");
    map.put(2, "banana");
    map.put(3, "cherry");

    assertEquals(3, map.size());
    assertTrue(map.containsKey(2));
    assertTrue(map.containsValue("banana"));
  }
}