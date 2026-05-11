public class BasicCalculatorII {
    public static int calculate(String s) {
        int num = 0, result = 0, prev = 0;
        char sign = '+';
        for (int i = 0; i <= s.length(); i++) {
            char c = i < s.length() ? s.charAt(i) : '+';
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == ' ') continue;
            else {
                if (sign == '+') {
                    result += prev;
                    prev = num;
                } else if (sign == '-') {
                    result += prev;
                    prev = -num;
                } else if (sign == '*') prev *= num;
                else if (sign == '/') prev /= num;
                sign = c;
                num = 0;
            }
        }
        return result + prev;
    }
}