import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeralConverter {
    private static final Map<String, Integer> ROMAN_MAP = new LinkedHashMap<>();
    static {
        ROMAN_MAP.put("M", 1000); ROMAN_MAP.put("CM", 900); ROMAN_MAP.put("D", 500);
        ROMAN_MAP.put("CD", 400); ROMAN_MAP.put("C", 100); ROMAN_MAP.put("XC", 90);
        ROMAN_MAP.put("L", 50);  ROMAN_MAP.put("XL", 40); ROMAN_MAP.put("X", 10);
        ROMAN_MAP.put("IX", 9);  ROMAN_MAP.put("V", 5);   ROMAN_MAP.put("IV", 4);
        ROMAN_MAP.put("I", 1);
    }

    public static String toRoman(int num) {
        if (num <= 0 || num > 3999) throw new IllegalArgumentException("Out of range: 1-3999");
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : ROMAN_MAP.entrySet()) {
            while (num >= entry.getValue()) { sb.append(entry.getKey()); num -= entry.getValue(); }
        }
        return sb.toString();
    }

    public static int fromRoman(String roman) {
        if (roman == null || roman.isEmpty()) throw new IllegalArgumentException("Invalid input");
        int result = 0, prev = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int curr = ROMAN_MAP.getOrDefault(String.valueOf(roman.charAt(i)), 0);
            result += (curr < prev) ? -curr : curr;
            prev = curr;
        }
        return result;
    }

    public static boolean isValidRoman(String roman) {
        if (roman == null || roman.isEmpty()) return false;
        try { return toRoman(fromRoman(roman)).equals(roman); }
        catch (Exception e) { return false; }
    }
}