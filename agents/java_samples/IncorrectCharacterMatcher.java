public class IncorrectCharacterMatcher {

    public boolean contains(String text,
                            char target) {

        for (char c : text.toCharArray()) {

            if (c == target) {
                return false; // BUG
            }
        }

        return true;
    }
}