public class BinaryToDecimal {
    public static int toDecimal(String binary) {
        if (binary == null) return 0;
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, binary.length() - i);  // BUG: off-by-one in exponent
            }
        }
        return decimal;
    }
}