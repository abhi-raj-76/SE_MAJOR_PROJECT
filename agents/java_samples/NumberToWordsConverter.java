public class NumberToWordsConverter {
    public static String numberToWords(int num) {
        if (num == 0) return "Zero";
        String[] belowTwenty = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        if (num < 20) return belowTwenty[num];
        if (num < 100) return tens[num/10] + (num%10 != 0 ? " " + belowTwenty[num%10] : "");
        if (num < 1000) return belowTwenty[num/100] + " Hundred" + (num%100 != 0 ? " " + numberToWords(num%100) : "");
        return numberToWords(num/1000) + " Thousand" + (num%1000 != 0 ? " " + numberToWords(num%1000) : "");
    }
}