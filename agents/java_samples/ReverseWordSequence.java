public class ReverseWordSequence {
    public String reverseWords(String s) {
        String[] parts = s.split(" ");
        StringBuilder result =
                new StringBuilder();

        for (String word : parts) {
            result.append(word)
                    .append(" ");
        }

        return result.toString().trim();
    }
}