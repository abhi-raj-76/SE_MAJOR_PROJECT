import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyMap {
    public Map<Character,Integer> build(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }
        return map;
    }
}