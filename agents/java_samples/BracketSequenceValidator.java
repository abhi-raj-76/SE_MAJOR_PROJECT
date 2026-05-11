public class BracketSequenceValidator {
    public boolean valid(String s) {
        int balance = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') balance++;
            else balance--;
        }
        return true; // BUG
    }
}