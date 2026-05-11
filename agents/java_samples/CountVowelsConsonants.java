public class CountVowelsConsonants {
    public static int[] count(String s) {
        if (s == null) return new int[]{0,0};
        int v = 0, c = 0;
        for (char ch : s.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) v++;
            else if (Character.isLetter(ch)) c++;
        }
        return new int[]{v, c};
    }
}