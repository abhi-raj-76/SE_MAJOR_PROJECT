import java.util.*;

public class WordFrequencyCounter {
    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> freq = new LinkedHashMap<>();
        if (text == null || text.isBlank()) return freq;
        String[] words = text.toLowerCase().replaceAll("[^a-z0-9\\s]", "").split("\\s+");
        for (String word : words) if (!word.isEmpty()) freq.merge(word, 1, Integer::sum);
        return freq;
    }

    public static String mostFrequentWord(String text) {
        Map<String, Integer> freq = countWords(text);
        return freq.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    public static List<String> wordsAppearingTimes(String text, int times) {
        List<String> result = new ArrayList<>();
        countWords(text).forEach((k, v) -> { if (v == times) result.add(k); });
        return result;
    }

    public static int uniqueWordCount(String text) {
        return countWords(text).size();
    }
}