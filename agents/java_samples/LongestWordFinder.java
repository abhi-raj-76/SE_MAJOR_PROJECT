public class LongestWordFinder {
    public static String longestWord(String sentence) {
        String[] words =
                sentence.split(" ");

        String longest = "";

        for (String word : words) {
            if (word.length() >
                    longest.length()) {

                longest = word;
            }
        }

        return longest;
    }
}