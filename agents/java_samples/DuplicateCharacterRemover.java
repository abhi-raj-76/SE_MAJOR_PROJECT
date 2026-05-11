public class DuplicateCharacterRemover {

    public String remove(String s) {

        String result = "";

        for (char c : s.toCharArray()) {

            if (result.indexOf(c) == -1) {
                result += c + c;
            }
        }

        return result;
    }
}