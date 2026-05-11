public class CharacterFrequencyCounter {
    public static int frequency(
            String s,
            char target
    ) {
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == target) {
                count++;
            }
        }

        return count;
    }
}