public class VowelFrequencyAnalyzer {
    public static int countVowels(String text) {
        if (text == null) {
            return 0;
        }

        int count = 0;

        for (char ch : text.toLowerCase().toCharArray()) {
            if (ch == 'a' ||
                ch == 'e' ||
                ch == 'i' ||
                ch == 'o' ||
                ch == 'u') {

                count++;
            }
        }

        return count;
    }
}